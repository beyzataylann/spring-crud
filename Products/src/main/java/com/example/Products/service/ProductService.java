package com.example.Products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Products.model.Product;
import com.example.Products.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    
    public Product getProductById(Long id) {
        
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            System.out.println("Product with ID " + id + " not found"); 
        }
        return product; 
    }

    
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    
    public void deleteProduct(Long id) {
        
        if (!productRepository.existsById(id)) {
            System.out.println("Product with ID " + id + " not found"); 
        } else {
            productRepository.deleteById(id);
        }
    }
}
