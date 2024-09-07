package com.itg.websample.feignclient;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.itg.websample.entity.Product;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/api/product")
    List<Product> getAllProducts();

    @GetMapping("/api/product/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @PostMapping("/api/product")
    Product createProduct(Product product);

    @DeleteMapping("/api/product/{id}")
    String deleteProduct(@PathVariable("id") Long id);
}
