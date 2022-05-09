package com.reloadly.log4jappender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jAppenderApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Log4jAppenderApplication.class, args);
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld.createLogs();
    }
}
