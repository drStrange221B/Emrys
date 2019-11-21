package com.inc.emrys.rojaya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    @RequestMapping(value="/")
    private String getView()
    {
        return "index";
    }


}
