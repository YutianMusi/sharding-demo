package com.sharding.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.setProperty("jasypt.encryptor.password", "mch-statistics");
        SpringApplication.run(DemoApplication.class, args);
    }

}
