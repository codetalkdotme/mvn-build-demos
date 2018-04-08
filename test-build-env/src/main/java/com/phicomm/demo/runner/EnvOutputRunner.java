package com.phicomm.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EnvOutputRunner implements CommandLineRunner {

    @Value("${msg}")
    private String msg;

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvOutputRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("The message is: " + msg);
    }

}
