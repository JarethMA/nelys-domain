package com.nelys.pizza.bussines.domain.repository;


import com.nelys.pizza.bussines.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
