package com.inc.emrys.rojaya.controllers;

import com.inc.emrys.rojaya.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;


//    public JokeController(JokeService jokeService) {
//        this.jokeService = jokeService;
//    }

    @RequestMapping({"/",""})
    public String showJoke(Model mOdel)
    {

        mOdel.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }

}
