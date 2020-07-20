package com.ftt.eurekaconsumeropenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EurekaConsumerOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerOpenfeignApplication.class, args);
    }

}
