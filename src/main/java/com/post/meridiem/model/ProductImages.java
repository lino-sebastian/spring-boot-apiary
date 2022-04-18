package com.post.meridiem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductImages {
    @JsonProperty("image_url")
    private String imageURL;
    @JsonProperty("image_alt_text")
    private String imageAlternateText;
}
