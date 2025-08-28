package com.nelys.pizza.bussines.domain.repository;

import com.nelys.pizza.bussines.domain.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
