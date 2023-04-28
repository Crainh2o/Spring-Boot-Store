package com.example.Store.repository;

import com.example.Store.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByNameAndAndID(Long productsId);

    Products findByNameAndId(Long userId, Long productsId);
}
