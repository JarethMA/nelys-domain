package com.nelys.pizza.bussines.domain.repository;

import com.nelys.pizza.bussines.domain.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
