package com.example.Store.repository;

import com.example.Store.model.Products;
import com.example.Store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// define any custom methods for product repository
public interface ProductRepository extends JpaRepository<Products, Long> {
    static User getCurrentLoggedInUser() {
        return null;
    }

    List<Products> findByNameAndAndID(Long productsId);

    Products findByNameAndId(Long userId, Long productsId);

    Optional<Products> findByIdAndUserId(Long id);

    void setUser(User currentLoggedInUser);
}

