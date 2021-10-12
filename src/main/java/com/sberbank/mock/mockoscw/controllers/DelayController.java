package com.sberbank.mock.mockoscw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DelayController {

    @GetMapping("/")
    public String homePage(@RequestParam(name="name", required=false, defaultValue="Поцык") String name, Model model) {
        model.addAttribute("name", name);
        return "delay";
    }

    @PostMapping("/")
    public String changeDelay(@RequestParam String delay, Model model){
        //Post post = new Post(delay);
        return "";
    }

}