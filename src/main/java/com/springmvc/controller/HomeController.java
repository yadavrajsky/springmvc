package com.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Akash Yadav");
    	return "index";
    }
    @RequestMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        modelAndView.addObject("name", "Akash Yadav");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        modelAndView.addObject("versions",list);
    	return modelAndView;
    }
}
