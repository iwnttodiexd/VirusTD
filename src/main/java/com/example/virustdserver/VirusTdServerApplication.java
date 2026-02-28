package com.example.virustdserver;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class VirusTdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirusTdServerApplication.class, args);
    }

}
