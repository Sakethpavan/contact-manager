package com.astro.contact_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home");
        model.addAttribute("message", "home");
        model.addAttribute("title", "Home");
        return "home";
    }


}
