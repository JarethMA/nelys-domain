package com.nelys.pizza.bussines.domain.repository;

import com.nelys.pizza.bussines.domain.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
