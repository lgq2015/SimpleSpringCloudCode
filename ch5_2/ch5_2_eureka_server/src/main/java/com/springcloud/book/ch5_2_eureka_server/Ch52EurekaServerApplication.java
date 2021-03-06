package com.springcloud.book.ch5_2_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch52EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch52EurekaServerApplication.class, args);
    }

}
