package com.example.manav.controller;


import com.example.manav.model.User;
import com.example.manav.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {

    UserService userService;

    public Registration(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    @ResponseBody
    public String signUp(@RequestBody User user)
    {
       userService.saveUser(user);
       return "Succesfully registerd";
    }


    @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        return  userService.login(user);
    }
}
