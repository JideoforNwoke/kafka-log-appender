package com.reloadly.log4jappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void createLogs() throws InterruptedException {
        int k = 0;
        boolean b = true;
        while (b) {
            logger.info("create logs and send log  messages  to Kafka topic at " +
                    DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
            k++;
            b = k < Integer.MAX_VALUE;
            Thread.sleep(1000);
        }
    }
}
