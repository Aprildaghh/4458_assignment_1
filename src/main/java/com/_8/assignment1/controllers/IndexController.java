package com._8.assignment1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String redirectToHello()
    {
        return "redirect:/api/v1/test/hello";
    }

}
