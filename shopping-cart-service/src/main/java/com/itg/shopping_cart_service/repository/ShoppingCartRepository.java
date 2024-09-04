package com.itg.shopping_cart_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itg.shopping_cart_service.entity.ShoppingCart;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	Optional<ShoppingCart> findById(Long id);
    Optional<ShoppingCart> findByShoppingCartName(String shoppingCartName);
}
