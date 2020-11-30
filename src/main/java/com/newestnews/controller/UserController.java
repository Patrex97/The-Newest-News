package com.newestnews.controller;

import com.newestnews.model.User;
import com.newestnews.service.serviceImpl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

  private UserServiceImpl userService;

  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @PostMapping("/register")
  public void register(@RequestBody User user, HttpServletRequest request) {
    userService.addUser(user, request);
  }

  @RequestMapping("/verify-token")
  public String confirmationByEmail(@RequestParam String token) {
    userService.verifyToken(token);
    return "Gratulacje.Twój adres mailowy został potwierdzony";
  }
}
