package com.github.perscholas.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
