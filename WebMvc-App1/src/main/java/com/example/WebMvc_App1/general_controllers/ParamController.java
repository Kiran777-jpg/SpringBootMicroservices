package com.example.WebMvc_App1.general_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    @GetMapping("/board")
    public String greet(@RequestParam("name") String name, @RequestParam("dept") String dept, Model model) {
        String msg = name + " Welcome on board to... " + dept;
        model.addAttribute("msg1", msg);
        return "index";
    }

    @GetMapping("/board/{name}/dept/{dept}")
    public String greet2(@PathVariable("name") String name, @PathVariable("dept") String dept, Model model) {
        String msg = name + " How are you, Welcome on board to... " + dept;
        model.addAttribute("msg1", msg);
        return "index";
    }
}
