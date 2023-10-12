package com.example.Spring_Demo.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_Controller
{
    @Value("${coach.name}")
    private String coach_Name;

    @Value("${team.name}")
    private String team_Name;

    //exposing custom properties value
    @GetMapping("/Team_info")
    public String TeamInfo()
    {
        return "Team Name : "+team_Name+"Coach name : "+coach_Name;
    }

    //expose '/' that returns hello world
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World";
    }

    //exposing '/workout'
    @GetMapping("/workout")
    public String workout()
    {
        return "Run 5km";
    }
}
