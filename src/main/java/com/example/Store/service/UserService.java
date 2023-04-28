package com.example.Store.service;

import com.example.Store.exception.InformationExistException;
import com.example.Store.exception.InformationNotFoundException;
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
}

//public ResponseEntity<?> loginUser(LoginRequest loginRequest) {
//        try {
//        Authentication authentication = authenticationManager.authenticate(
//        new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        myUserDetails = (MyUserDetails) authentication.getPrincipal();
//
//final String JWT = jwtUtils.generateJwtToken(myUserDetails);
//        return ResponseEntity.ok(new LoginResponse(JWT));
//        } catch (Exception e) {
//        return ResponseEntity.ok(new LoginResponse("Error : username or password is incorrect"));
//        }
//        }
//        }