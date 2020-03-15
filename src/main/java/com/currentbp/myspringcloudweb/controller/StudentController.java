package com.currentbp.myspringcloudweb.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baopan
 * @createTime 2020/3/15 14:12
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@RequestMapping(value = "/student")
public class StudentController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String home() {
        return "hi ,i am from port:";
    }

}
