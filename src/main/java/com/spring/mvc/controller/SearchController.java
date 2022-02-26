package com.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping(path = "/user/{userId}/{userName}")
    public String getUserDetails(@PathVariable("userId") int userId,
                                 @PathVariable("userName") String userName) {

        System.out.println(userId);
        System.out.println(userName);
        return "contact";
    }

    @RequestMapping(path = "/search")
    public String search() {
        System.out.println("going to search view.........");
        String st = null;
        System.out.println(st.length());
        return "search";
    }

    @RequestMapping(path = "/searchSuccess")
    public RedirectView searchQuery(@RequestParam("queryBox") String query) {
        System.out.println(query);
        RedirectView redirectView = new RedirectView();
        if (query.isBlank()) {
            redirectView.setUrl("search");
            return redirectView;
        }
        String url = "https://www.google.com/search?q=" + query;
        redirectView.setUrl(url);
        return redirectView;
    }

//    // handling exception in spring-mvc
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public String exceptionHandler(Model model) {
//        model.addAttribute("msg", "exception something......");
//        return "null_page";
//    }

}
