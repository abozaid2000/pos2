package com.abdabughazaleh.pos.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.abdabughazaleh.pos.pos.repository")
public class PosApplication {
    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);
    }

}
