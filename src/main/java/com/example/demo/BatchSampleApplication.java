package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication
@Slf4j
public class BatchSampleApplication {

    public static void main(String[] args) {
        log.info("main call");
        SpringApplication.run(BatchSampleApplication.class, args);
    }
}
