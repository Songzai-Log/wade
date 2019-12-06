package com.archi.wade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/checker")
    public String checker(){
        return "checker";
    }

    @RequestMapping("/index")
    public String user(){
        return "index";
    }
}
