package com.post.meridiem.service;

import com.post.meridiem.client.ProductClient;
import com.post.meridiem.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductClient productClient;

    public List<Products> getAllProducts() {
        return productClient.getAllProducts();
    }
}
