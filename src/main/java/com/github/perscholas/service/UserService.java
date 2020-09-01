package com.github.perscholas.service;


import com.github.perscholas.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
