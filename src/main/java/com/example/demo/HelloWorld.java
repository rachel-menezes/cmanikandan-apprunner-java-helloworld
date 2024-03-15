package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Async;

@RestController
public class HelloWorld {
    @Autowired
    private LoggingService loggingService;
    static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping("/")
    public String index() {
        log.info("------------Before returning response-------------");
        String s = "Hello World from AWS App Runner. The JDK version is " + System.getProperty("java.version");
        loggingService.log();
        log.info("------------After returning response-------------");
        return s;

    }

}

