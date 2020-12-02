package com.sharding.test;

import cn.hutool.core.util.HashUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application-sharding.properties")
public class DemoApplication {

    public static void main(String[] args) {
//        System.setProperty("jasypt.encryptor.password", "mch-statistics");
//        SpringApplication.run(DemoApplication.class, args);


    }

}
