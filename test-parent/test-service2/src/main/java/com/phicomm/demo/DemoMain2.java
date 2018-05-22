package com.phicomm.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guobiao.xu on 2018/5/22.
 */
@SpringBootApplication
@RestController
public class DemoMain2 {

    @Value("${config.env}")
    private String env;

    @Value("${config.serviceName}")
    private String serviceName;

    public static void main(String[] args) {
        SpringApplication.run(DemoMain2.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return String.format("Hello, this is %s of env %s!", serviceName, env);
    }

}
