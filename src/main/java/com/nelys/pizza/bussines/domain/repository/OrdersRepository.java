package com.nelys.pizza.bussines.domain.repository;

import com.nelys.pizza.bussines.domain.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
