package com.example.manav.service.impl;

import com.example.manav.model.User;
import com.example.manav.repository.UserRepository;
import com.example.manav.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public String login(User user) {

      return userRepository.findByEmail(user.getEmail(),user.getPassword());
    }


}
