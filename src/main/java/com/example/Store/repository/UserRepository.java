package com.example.Store.repository;

import com.example.Store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // register
    boolean existsByEmailAddress(String emailAddress);

    //login
    User findUserByEmailAddress(String emailAddress);
}
