package com.nelys.pizza.bussines.domain.repository;

import com.nelys.pizza.bussines.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
