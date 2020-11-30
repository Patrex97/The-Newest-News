package com.newestnews.service;

import com.newestnews.model.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    void addUser(User user, HttpServletRequest request);
}
