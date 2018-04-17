package com.phicomm.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) {
        LOGGER.info("Start application...");

        SpringApplication.run(TestMain.class, args);
    }

}
