package com.example.Store.controller;


import com.example.Store.model.Products;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api") //http://localhost:9094/api/products/
public class ProductController {
    @GetMapping(path = "/api/products/")
    private String getProducts() {
        return "get all products";
    }

    // http://localhost:9094/api/api/products/
    @PostMapping(path = "/api/api/products/")
    public Products createProducts(@RequestBody Products categoryObject) {
        ProductController productService = new ProductController();
        return productService.createProducts(categoryObject);
    }
}

