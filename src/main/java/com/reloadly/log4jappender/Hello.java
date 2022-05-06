package com.reloadly.log4jappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {

    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    public static void log() throws InterruptedException {
        while (true) {
            logger.info("Inside scheduleTask - Sending logs to Kafka at " +
                    DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
            Thread.sleep(3000);
        }
    }
}
