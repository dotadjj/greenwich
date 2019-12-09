package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${writer}")
    String writer;

    @RequestMapping(value = "/writer")
    public String writer(){
        return writer;
    }
}
