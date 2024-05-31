package com.dailystandups.dsudiscordbot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Configuration
public class Config {

    @Bean
    public Instant startTime(){
        return Instant.now();
    }
}
