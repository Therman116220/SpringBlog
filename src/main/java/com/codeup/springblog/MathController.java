package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

//This controller should listen for requests for several routes that correspo----


    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody

    public String addNums(@PathVariable int num1, @PathVariable int num2){
        return "Hey, user! You wanted to add " + num1 + " and " + num2 + " together, here's the sum: " + (num1 + num2);
    }




    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody

    public String subtractNums(@PathVariable int num1, @PathVariable int num2){
        return "Hey, user! You wanted to subtract " + num1 + " from " + num2 + ", here's the difference: " + (num2 - num1);
    }


    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody

    public String multiplyNums(@PathVariable int num1, @PathVariable int num2){
        return "Hey, user! You wanted to multiply " + num1 + " and " + num2 + ", here's the product: " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody

    public String divideNums(@PathVariable int num1, @PathVariable int num2){
        return "Hey, user! You wanted to divide " + num1 + " by " + num2 + ", here's the quotient: " + ((double) num1 /(double) num2);
    }


}

