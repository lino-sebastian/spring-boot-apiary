package com.post.meridiem.service;

import com.post.meridiem.api.DefaultApi;
import com.post.meridiem.model.Product;
import com.post.meridiem.model.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.singletonList;
import static java.util.Optional.ofNullable;

@Service
public class ProductService implements DefaultApi {

    @Override
    public ResponseEntity<List<Product>> productsGet() {
        Product product = new Product();
        product.setProductId("100");
        product.setProductName("Sample Product");
        return ResponseEntity.ok(singletonList(product));
    }

    @Override
    public ResponseEntity<Product> productsPost(ProductRequest productRequest) {
        Product product = new Product();
        ofNullable(productRequest).map(ProductRequest::getProductId).ifPresent(product::setProductId);
        ofNullable(productRequest).map(ProductRequest::getProductName).ifPresent(product::setProductName);
        return ResponseEntity.ok(product);
    }
}
