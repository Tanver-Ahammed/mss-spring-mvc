package com.spring.mvc.controller;

import com.spring.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @RequestMapping(path = "/complex_form")
    public String complexForm() {
        return "complex_form";
    }

    @RequestMapping(path = "/handleForm", method = RequestMethod.POST)
    public String handleComplexForm(@ModelAttribute("student") Student student, BindingResult bindingResult) {

//        ModelAndView modelAndView = new ModelAndView();
        System.out.println(student);

        if (bindingResult.hasErrors()) {
            return "complex_form";
        }

//        model.addAttribute("student", student);

//        System.out.println(student.getId());
//        System.out.println(student.getName());
//        System.out.println(student.getDob());
//        System.out.println(student.getCourses());
//        System.out.println(student.getGender());
//        System.out.println(student.getType());
//        System.out.println(student.getAddress());

        return "success-complex-form";

    }

}
