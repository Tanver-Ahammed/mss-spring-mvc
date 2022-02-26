package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

    @RequestMapping(path = "/one")
    public RedirectView one() {
        System.out.println("this is one handler.........");
        // using redirect prefix
//        return "redirect:/enjoy";

        // RedirectView
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com/");
        return redirectView;
    }

    @RequestMapping(path = "/enjoy")
    public String two() {
        System.out.println("this is two handler[enjoy].........");
        return "contact";
    }

}
