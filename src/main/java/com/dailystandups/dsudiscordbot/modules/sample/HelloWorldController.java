package com.dailystandups.dsudiscordbot.modules.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }
}
