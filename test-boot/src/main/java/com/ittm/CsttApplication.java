package com.ittm;


import javafx.css.CssMetaData;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ittm")
@SpringBootApplication
public class CsttApplication {
    public static void main(String[] args) {
        SpringApplication.run(CsttApplication.class,args);
    }
}
