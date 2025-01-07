package com.unir.bookingmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unir.bookingmicroservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
