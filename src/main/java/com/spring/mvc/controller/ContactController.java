package com.spring.mvc.controller;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("Header", "I am Tanver Ahammed.");
        model.addAttribute("desc", "I am a Java Developer.");
        System.out.println("adding common data to model.........");
    }

    @RequestMapping(path = "/contact")
    public String showForm() {
        System.out.println("creating form...........");
        return "contact";
    }

    @RequestMapping(path = "/processFrom", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user, Model model) {

//        String email = request.getParameter("email");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

        System.out.println("User E-mail is: " + user.getEmail());
        System.out.println("User Name is: " + user.getUsername());
        System.out.println("User Password is: " + user.getPassword());

//        model.addAttribute("email", email);
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);

//        User user = new User(email, username, password);
        model.addAttribute("user", user);

        int createUserId = this.userService.createUser(user);

        model.addAttribute("massage", "User created with Id: " + createUserId);

        if (user.getUsername().isBlank()) {
            return "redirect:/contact";
        }

        return "success-form";
    }

}