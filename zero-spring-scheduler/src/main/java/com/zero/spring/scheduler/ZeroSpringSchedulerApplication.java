package com.zero.spring.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ZeroSpringSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroSpringSchedulerApplication.class, args);
    }

}
