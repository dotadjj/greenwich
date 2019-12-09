package com.example.eurakeconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private FeignExampleService feignExampleService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return feignExampleService.hello(name);
    }

}
