package com.ak.learning.thymeleafradio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    ContestService contestService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("contest", contestService.getContest());
        model.addAttribute("formCommand", new FormCommand());
        return "home";
    }

    @PostMapping("/submit")
    public String submit(final FormCommand formCommand, Model model) {
        System.out.println(formCommand.getAnswers());
        return "success";
    }

}
