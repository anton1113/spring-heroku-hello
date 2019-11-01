package com.arash.edu.springsandbox;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSandboxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringSandboxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Spring!");
    }
}
