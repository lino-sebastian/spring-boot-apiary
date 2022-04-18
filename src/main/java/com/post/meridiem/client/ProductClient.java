package com.post.meridiem.client;

import com.post.meridiem.model.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://private-dbbdf-linosebastian.apiary-mock.com/",name = "PRODUCT-CLIENT")
public interface ProductClient {
    @GetMapping("/products")
    List<Products> getAllProducts();
}
