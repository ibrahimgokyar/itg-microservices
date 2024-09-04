package com.itg.product_service.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itg.product_service.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(Long id);
}
