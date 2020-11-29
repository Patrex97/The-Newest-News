package com.newestnews.controller;

import com.newestnews.model.User;
import com.newestnews.service.serviceImpl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private UserServiceImpl userService;

  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @PostMapping("/register")
  public @ResponseBody ResponseEntity<User> register(@RequestBody User user) {
    return ResponseEntity.ok(userService.addUser(user));
  }
}
