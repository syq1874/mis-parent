package com.yc.springcloud81.misconsumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringBootApplication
public class ConsumerStarApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarApp.class,args);
    }

}
