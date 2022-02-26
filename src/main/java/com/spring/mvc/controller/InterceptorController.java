package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping(path = "/interceptor")
    public String interceptorValidity() {
        return "interceptor";
    }

    // handle for request
    @RequestMapping(path = "/interceptorSuccess", method = RequestMethod.POST)
    public String interceptorHandle(@RequestParam("interceptorValue") String interceptorValue, Model model) {
        System.out.println(interceptorValue);
        model.addAttribute(interceptorValue, interceptorValue);
        return "interceptorSuccess";
    }

}
