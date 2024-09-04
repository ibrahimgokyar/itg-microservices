package com.itg.product_service.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.itg.product_service.entity.Product;
import com.itg.product_service.service.ProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/product")
@Tag(name = "product", description = "Product Endpoints")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId) {
		return productService.getProductById(productId);
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@PutMapping("{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Long productId,
			@RequestBody Product updatedProduct) {
		return productService.updateProduct(productId, updatedProduct);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		return productService.deleteProduct(id);
	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll() {
		return productService.deleteAllProducts();
	}

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
      return productService.allProducts();
    }

}
