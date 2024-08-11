package com.dailystandups.dsudiscordbot.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="dsubot", url="${base.url}")
public interface Axios {
    @GetMapping("/helloworld")
    String get();
}
