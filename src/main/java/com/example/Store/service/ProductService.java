package com.example.Store.service;

import com.example.Store.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;
    private ProductService productService;
    
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
