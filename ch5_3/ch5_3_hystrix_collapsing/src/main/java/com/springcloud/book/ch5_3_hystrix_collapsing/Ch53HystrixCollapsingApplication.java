package com.springcloud.book.ch5_3_hystrix_collapsing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
public class Ch53HystrixCollapsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch53HystrixCollapsingApplication.class, args);
    }

}
