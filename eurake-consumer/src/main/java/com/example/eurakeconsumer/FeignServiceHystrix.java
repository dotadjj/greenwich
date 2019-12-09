package com.example.eurakeconsumer;

import org.springframework.web.bind.annotation.RequestParam;

public class FeignServiceHystrix implements FeignExampleService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，service has fail!";
    }
}
