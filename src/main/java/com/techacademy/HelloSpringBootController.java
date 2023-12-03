package com.techacademy;

import java.time.LocalDateTime; // 追加
import java.time.format.DateTimeFormatter; // 追加

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    // ----- 追加:ここから -----
    @GetMapping("now")
    public String dispTime() {
        String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss") );

        return "現在時刻：" + now;
    }
    // ----- 追加:ここまで -----
}