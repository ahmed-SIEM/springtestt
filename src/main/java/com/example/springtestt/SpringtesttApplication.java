package com.example.springtestt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class SpringtesttApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtesttApplication.class, args);
    }


}
