package com.newestnews.service.serviceImpl;

import com.newestnews.model.User;
import com.newestnews.model.VerificationToken;
import com.newestnews.repository.UserRepository;
import com.newestnews.repository.VerificationTokenRepository;
import com.newestnews.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  private PasswordEncoder passwordEncoder;

  private VerificationTokenRepository verificationTokenRepository;

  private MailSenderServiceImpl mailSenderService;

  public UserServiceImpl(
      UserRepository userRepository,
      PasswordEncoder passwordEncoder,
      VerificationTokenRepository verificationTokenRepository,
      MailSenderServiceImpl mailSenderService) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
    this.verificationTokenRepository = verificationTokenRepository;
    this.mailSenderService = mailSenderService;
  }

  public void addUser(User user, HttpServletRequest request) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);

    String token = UUID.randomUUID().toString();

    VerificationToken verificationToken = new VerificationToken(user, token);
    verificationTokenRepository.save(verificationToken);

    String url =
        "http://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/verify-token?token="
            + token;
    try {
      mailSenderService.sendMail(user.getUsername(), "VerificationToken", url, false);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }

  public void verifyToken(String token) {
    User user = verificationTokenRepository.findByValue(token).getUser();
    user.setEnabled(true);
    userRepository.save(user);
  }
}
