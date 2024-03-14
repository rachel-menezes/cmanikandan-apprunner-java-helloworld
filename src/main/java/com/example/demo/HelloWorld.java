package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Async;

@RestController
public class HelloWorld {

    static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping("/")
    @Async
    public String index() {
        log.info("------------Before returning response-------------");
        for( int i = 0; i < 100000; i++){
            log.info("The log line printed is for {} and thread {}", i, Thread.currentThread().getName());
        }
        String s = "Hello World from AWS App Runner. The JDK version is " + System.getProperty("java.version");
        log.info("------------After returning response-------------");
        return s;

    }

}

