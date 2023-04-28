package com.example.Store.repository;

import com.example.Store.model.Orders;
import com.example.Store.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrdersRepository  extends JpaRepository<Orders, Long> {

    // get all orders belong in user id
    List<Orders> findByUserId(Long userId);

    // get orders by id and user id
    Optional<Orders> findByIdAndUserId(Long ordersId, Long userId);
}
