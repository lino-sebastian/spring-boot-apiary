package com.post.meridiem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Products {
    @JsonProperty("product_id")
    private int productId;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_desc")
    private String productDescription;
    @JsonProperty("product_price")
    private Double productPrice;
    @JsonProperty("product_images")
    private List<ProductImages> productImagesList;

}
