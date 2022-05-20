package com.example.manav.service;

import com.example.manav.model.User;

public interface UserService {

    void saveUser(User user);

    String login(User user);
}
