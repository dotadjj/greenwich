package com.example.serviceconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements ExampleService {

      @Autowired
      private RestTemplate restTemplate;

        @Override
        public String hello(String name) {
            return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
        }
}
