package com.example.serviceconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    RibbonServiceImpl ribbonService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return ribbonService.hello(name);
    }
}
