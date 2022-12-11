package com.lpetri.spring_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpetri.spring_api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
