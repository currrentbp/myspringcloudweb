package com.currentbp.myspringcloudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyspringcloudwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudwebApplication.class, args);
    }

}
