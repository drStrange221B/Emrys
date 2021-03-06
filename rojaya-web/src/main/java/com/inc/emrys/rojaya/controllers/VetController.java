package com.inc.emrys.rojaya.controllers;

import com.inc.emrys.rojaya.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/","/index","/ownersList.html",""})
    public String listVets(Model model)
    {
        model.addAttribute("vets",vetService.findAll());

        return "vets/index";
    }
}
