package com.example.Products.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Products.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}