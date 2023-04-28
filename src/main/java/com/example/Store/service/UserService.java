package com.example.Store.service;

import com.example.Store.exception.InvalidCredentialsException;
import com.example.Store.model.User;
import com.example.Store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String username, String password) {
        User user = userRepository.findByUserName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }

}
