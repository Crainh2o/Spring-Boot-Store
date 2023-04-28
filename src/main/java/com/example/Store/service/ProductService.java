package com.example.Store.service;

import com.example.Store.exception.InformationNotFoundException;
import com.example.Store.model.Products;
import com.example.Store.repository.OrdersRepository;
import com.example.Store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Optional<Products>> getCategory(Long categoryId) {
        Optional<Products> products = productRepository.findByIdAndUserId(ProductRepository.getCurrentLoggedInUser().getId());
        if (products == null) {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        } else {
            Optional<Products> Products = null;
            return Optional.empty();
        }
    }

}
