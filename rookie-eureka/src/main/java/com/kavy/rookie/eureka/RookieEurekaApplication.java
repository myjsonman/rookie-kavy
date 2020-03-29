package com.kavy.rookie.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RookieEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RookieEurekaApplication.class, args);
    }

}
