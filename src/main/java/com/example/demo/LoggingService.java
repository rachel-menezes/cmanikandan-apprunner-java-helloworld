package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    @Async
    public void log(){
        try {
            Thread.sleep(1);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        for( int i = 0; i < 100000; i++){
            System.out.println("The log line printed is for " +i+ " and thread" + Thread.currentThread().getName());
        }
    }
}
