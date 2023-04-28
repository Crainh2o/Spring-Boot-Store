package com.example.Store.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api") //http://localhost:9094/api/categories/
public class ProductController {
    @GetMapping(path = "/api/categories/")
    private String getCategories() {
        return "get all categories";
    }

}

