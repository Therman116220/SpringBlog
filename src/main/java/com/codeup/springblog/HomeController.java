package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "<div> <p>Welcome to, The Landing Page</p></div>";
    }


}