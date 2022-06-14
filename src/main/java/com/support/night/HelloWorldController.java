package com.support.night;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/hello")
public class HelloWorldController {

    @GetMapping("/sunit")
    public String helloWorld(){
        return "I am at hello world";
    }
}
