package com.post.meridiem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootApiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiaryApplication.class, args);
    }

}
