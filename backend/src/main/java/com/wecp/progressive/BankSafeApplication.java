package com.wecp.progressive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BankSafeApplication {
    public static void main(String[] args) {
        //System.out.println("Welcome to BankSafe Project!");
        SpringApplication.run(BankSafeApplication.class, args);
        System.out.println("Welcome to BankSafe Project!");
    }
}