package com.suren.Dockerexample.rescource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/resource")
public class RestResource {

    @GetMapping("/hello")
    @ResponseBody
    public String helloMessage(){
        return "Hello Docker";
    }
}
