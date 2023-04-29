package com.example.Store.service;

import com.example.Store.exception.InformationExistException;
import com.example.Store.exception.InformationNotFoundException;
import com.example.Store.model.User;
import com.example.Store.repository.UserRepository;
import com.example.Store.security.JWTUtils;
import com.example.Store.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.management.remote.JMXAuthenticator;
import java.net.Authenticator;

@Service
public class UserService<LoginRequest> {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String username, String password) {
        User user = userRepository.findByUserName(username, password);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            throw new InformationNotFoundException("Invalid username or password");
        }
    }

    public User createUser(User userObject) {
        User user = userRepository.findUserByEmailAddress(userObject.getEmailAddress());
        return userObject;
        if (!userRepository.existsByEmailAddress(userObject.getEmailAddress())) {
            userObject.setPassword(passwordEncoder.encode(userObject.getPassword()));
            return userRepository.save(userObject);
        } else {
            throw new InformationExistException("user with email address " + userObject.getEmailAddress() +
                    " already exists");
        }
    }

    public User findUserByEmailAddress(String email) {
        return userRepository.findUserByEmailAddress(email);
    }

    public User createUser(User userObject) {
        return null;
    }


public ResponseEntity<?> loginUser(LoginRequest loginRequest) {
        try {
            Authentication authenticationManager = null;
            Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
            MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();

            JWTUtils jwtUtils = null;
            final String JWT = jwtUtils.generateJwtToken(myUserDetails);
        return ResponseEntity.ok(new LoginResponse(JWT));
        } catch (Exception e) {
        return ResponseEntity.ok(new LoginResponse("Error : username or password is incorrect"));
        }
        }
        }