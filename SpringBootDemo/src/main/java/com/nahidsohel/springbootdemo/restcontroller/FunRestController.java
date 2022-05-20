package com.nahidsohel.springbootdemo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World..Hi everyone!!";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Open the magic box please..";
    }

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach: " + coachName + ", " +  "Team: " + teamName + ".\n";
    }
}
