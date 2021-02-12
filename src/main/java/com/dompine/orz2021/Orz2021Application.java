package com.dompine.orz2021;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dompine.orz2021.*.mapper")
public class Orz2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Orz2021Application.class, args);
    }

}
