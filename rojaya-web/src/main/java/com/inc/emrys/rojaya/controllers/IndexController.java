package com.inc.emrys.rojaya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"/","","/index","/index.html"})
    public String index()
    {
        return "index";
    }
}
