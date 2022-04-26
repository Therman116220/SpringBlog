package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {



    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody

    public String addNums(@PathVariable int num1, @PathVariable int num2){
        return "Hello there, User. Here is the sum of " + num1 + " and " + num2 + ": " + (num1 + num2);
    }




    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody

    public String subtractNums(@PathVariable int num1, @PathVariable int num2){
        return "Hello there, User. Here is the difference of " + num1 + " from " + num2 + " : " + (num2 - num1);
    }


    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody

    public String multiplyNums(@PathVariable int num1, @PathVariable int num2){
        return "Hello there, User. Here is the product of " + num1 + " and " + num2 + " : " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody

    public String divideNums(@PathVariable int num1, @PathVariable int num2){                      //double to account for input
        return "Hey, user! You wanted to quotient of " + num1 + " divided by " + num2 + " : " + ((double) num1 /(double) num2);
    }


}

