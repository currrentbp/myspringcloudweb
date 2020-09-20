package com.currentbp.myspringcloudweb.controller;


import com.currentbp.common.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String home() {
        return "hi ,i am from port:";
    }



    @GetMapping("/getByName")
    public String getByName(@RequestParam String name){
        System.out.println("===>name:"+name);
        return restTemplate.getForObject("http://myspringcloudservice/getByName?name="+name, String.class);
    }

    @GetMapping("/getById")
    public Student getById(@RequestParam Integer id){
        System.out.println("===>id:"+id);
        return restTemplate.getForObject("http://myspringcloudservice/getById?id="+id, Student.class);
    }


//    @GetMapping("/getByIds")
//    public List getByIds(@RequestParam List<Integer> ids){
//        return restTemplate.getForObject("http://myspringcloudservice/getByIds?ids="+ids, List.class);
//    }

}
