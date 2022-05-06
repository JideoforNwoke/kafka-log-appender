package com.reloadly.log4jappender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootApplication
public class Log4jAppenderApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Log4jAppenderApplication.class, args);
        Hello hello = new Hello();
        Hello.log();
    }




}
