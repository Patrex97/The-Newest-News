package com.newestnews.service;

import javax.mail.MessagingException;

public interface MailSenderService {

    void sendMail(String to,String subject, String text, boolean isHtmlContent)throws MessagingException;
}
