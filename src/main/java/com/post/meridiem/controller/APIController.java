package com.post.meridiem.controller;

import com.post.meridiem.model.Product;
import com.post.meridiem.model.ProductRequest;
import com.post.meridiem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return productService.productsGet();
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createNewProduct(@RequestBody ProductRequest productRequest) {
        return productService.productsPost(productRequest);
    }
}
