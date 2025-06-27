package com.example.WebMvc_App1.forms.controller;

import com.example.WebMvc_App1.forms.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/User")
    public ModelAndView loadUserForm() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userObj", new User());
        mv.setViewName("user");
        return mv;
    }

    @PostMapping("/user")
    public ModelAndView handleUserForm(User user) {
        System.out.println(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "User Details Saved");
        mv.setViewName("success");
        return mv;
    }
}
