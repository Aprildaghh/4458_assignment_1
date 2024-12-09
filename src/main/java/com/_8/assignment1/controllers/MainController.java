package com._8.assignment1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class MainController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @RequestMapping("/end")
    public String end()
    {
        return "Thank you for listening!";
    }

}
