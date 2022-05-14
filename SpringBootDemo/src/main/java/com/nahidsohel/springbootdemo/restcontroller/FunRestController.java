package com.nahidsohel.springbootdemo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World..Hi everyone";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Open the magic box please..";
    }
}
