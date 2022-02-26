package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping(path = "first")
public class HomeController {

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is home url");
        model.addAttribute("id", 19016);
        model.addAttribute("name", "Md. Tanver Ahammed");
        List<String> friends = new ArrayList<>();
        friends.add("Monayem");
        friends.add("Dipu");
        friends.add("Popu");
        friends.add("Emran");
        friends.add("Hasi");
        model.addAttribute("friends", friends);
        return "home";
    }

    @RequestMapping(path = "/about")
    public String about() {
        System.out.println("This is about url");
        return "about";
    }

    @RequestMapping(path = "service")
    public String service() {
        System.out.println("This is about service url");
        return "service";
    }

    @RequestMapping(path = "help")
    public ModelAndView help() {
        System.out.println("This is about help url");
        ModelAndView modelAndView = new ModelAndView();
        // setting view page
        modelAndView.setViewName("help");
        // setting dynamic value
        modelAndView.addObject("id", 19016);
        modelAndView.addObject("name", "Aminul Bari");
        LocalDateTime localDateTime = LocalDateTime.now();
        modelAndView.addObject("time", localDateTime);

        // marks
        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(98);
        marks.add(65);
        marks.add(88);
        marks.add(54454);
        modelAndView.addObject("marks", marks);

        return modelAndView;
    }

//    @RequestMapping(path = "/contact")
//    public String showForm() {
//        return "contact";
//    }

}
