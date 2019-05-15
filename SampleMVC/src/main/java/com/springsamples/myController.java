package com.springsamples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {

    @RequestMapping("/")
    public ModelAndView firstView() {
        ModelAndView mav = new ModelAndView("hello");
        // must match the jsp page name which is being requested.
        mav.addObject("welcome", "Andy Welcomes you too , to the Spring Web MVC!");
        return mav;
    }
}