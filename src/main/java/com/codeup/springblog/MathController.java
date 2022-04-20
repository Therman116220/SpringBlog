package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

//This controller should listen for requests for several routes that correspond



    @Controller
    public class HelloController {
        @RequestMapping(path = "add/{numOne}/and/{numTwo}")
        @ResponseBody
        public Integer addNum(@PathVariable int numOne, @PathVariable int numTwo) {
            return numOne + numTwo;
        }


    @GetMapping("subtract/{numOne}/from/{numTwo}");
    @ResponseBody
    public String subtractNums(@PathVariable int numOne, @PathVariable int numTwo) {
        return "Hey User, heres the difference between" +numOne + " & " + numTwo + ".  " + (numTwo - numTwo);
    }

    @GetMapping("multiply/{numOne}/and/{numTwo}");
    @ResponseBody
    public String multiplyNums(@PathVariable int numOne, @PathVariable int numTwo) {
        return "Hey User, heres the total of " +numOne + " & " + numTwo + ".  " + (numTwo * numTwo);
    }

    @GetMapping("divide/{numOne}/by/{numTwo}");
    @ResponseBody
    public String divideNums(@PathVariable int numOne, @PathVariable int numTwo) {
        return "Hey User, heres the dividend of" +numOne + " & " + numTwo + ".  :" + ((double)numTwo / (double) numTwo);
    }
}
