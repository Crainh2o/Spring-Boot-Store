package com.example.Store.service;

import com.example.Store.exception.InformationExistException;
import com.example.Store.exception.InformationNotFoundException;
import com.example.Store.model.Products;
import com.example.Store.repository.OrdersRepository;
import com.example.Store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.example.Store.repository.ProductRepository.getCurrentLoggedInUser;

@Service
public class ProductService {
    private OrdersRepository ordersRepository;
    private ProductRepository productRepository;

    @Autowired
    public void setOrdersRepository(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Optional<Products>> getProducts(Long productId) {
        Optional<Products> products = productRepository.findByIdAndUserId(getCurrentLoggedInUser().getId());
        if (products.isEmpty()) {
            throw new InformationNotFoundException("category with id " + productId + " not found");
        } else {
            Optional<Products> Products = null;
            return Optional.empty();
        }
    }
    public Products createProducts(Products productId) {
        Optional<Products> category = productRepository.findByIdAndUserId(getCurrentLoggedInUser().getId());
        if (category != null) {
            throw new InformationExistException("Category with that name already exists.");
        } else {
            // we set the current logged-in user to the product before we save
            productRepository.setUser(getCurrentLoggedInUser());
            return productRepository.save(productId);
        }
    }

}
