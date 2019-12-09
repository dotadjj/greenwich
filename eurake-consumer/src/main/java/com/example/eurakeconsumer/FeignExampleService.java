package com.example.eurakeconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-producer",fallback = FeignServiceHystrix.class)
public interface FeignExampleService {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);

}
