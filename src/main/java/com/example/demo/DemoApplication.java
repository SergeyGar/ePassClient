package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner lookup() {
//        return args -> {
//            String username = "user";
//            String password = "user";
//
//            if (args.length >= 2) {
//                username = args[0];
//                password = args[1];
//            }
//            EPassClient ePassClient = new EPassClient(username, password);
//            ePassClient.getFullPartyByGLN(15);
//        };
//    }
}