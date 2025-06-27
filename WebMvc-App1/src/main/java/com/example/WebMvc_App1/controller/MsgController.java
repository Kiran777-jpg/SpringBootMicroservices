package com.example.WebMvc_App1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    @GetMapping("/greet")
    public ModelAndView greetMsg() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg1", "Good Morning");
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/greet2")
    public ModelAndView greetMsg2() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg2", "How is the day");
        mv.setViewName("index");
        return mv;
    }
}
