package com.example.Store.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {
    @GetMapping(path = "/api/categories/")
    private String getCategories() {
        return "get all categories";
    }

    @PostMapping(path = "/auth/users/login/")
    public String createCategory(@RequestBody String body) {
        return "User login  " + body;
    }
}

