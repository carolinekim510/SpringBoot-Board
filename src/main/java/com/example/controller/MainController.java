package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/joinPage")
    public String joinPage() {
        return "join";
    }

    @RequestMapping(value = "/loginPage")
    public String loginPage() {
        return "login";
    }


}
