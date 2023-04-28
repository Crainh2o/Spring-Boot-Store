package com.example.Store.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api") //http://localhost:9094/api/products/
public class ProductController {
    @GetMapping(path = "/api/products/")
    private String getProducts() {
        return "get all products";
    }

}

