package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Still Walking
 */
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class RecordTimeCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordTimeCloudApplication.class, args);
    }

}
