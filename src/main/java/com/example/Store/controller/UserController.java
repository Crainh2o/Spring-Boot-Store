package com.example.Store.controller;

import com.example.Store.model.User;
import com.example.Store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth/users/login/")

public class UserController{

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //http://localhost:9094/auth/users/register/
    @PostMapping(path = "/register/")
    public User createUser(@RequestBody User userObject) {
        return userService.createUser(userObject);
    }

    //http://localhost:9094/auth/users/login/
    @PostMapping(path = "/auth/users/login/")
    public String userLogin(@RequestBody String body) {
        return "User login  " + body;
    }
}



//    //http://localhost:9094/auth/users/login/
//    @PostMapping(path = "/login/")
//    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
//        return userService.loginUser(loginRequest);
//    }