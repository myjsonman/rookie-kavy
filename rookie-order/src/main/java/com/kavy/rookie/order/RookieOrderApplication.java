package com.kavy.rookie.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RookieOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RookieOrderApplication.class, args);
    }

}
