package com.example.Products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Products.model.Product;
import com.example.Products.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products"; 
    }

    
    @GetMapping("/create")
    public String createProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "create_product"; 
    }

    
    @PostMapping
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

   
    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
    System.out.println("Delete method called for ID: " + id);  
    productService.deleteProduct(id); 
    System.out.println("Redirecting to /products after deletion.");
    return "redirect:/products";  
    }


    

   
    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id); 
        model.addAttribute("product", product); 
        return "edit_product"; 
    }

    // Ürünü güncelle
    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product) {
        product.setId(id); 
        productService.saveProduct(product);  
        return "redirect:/products";
    }
}
