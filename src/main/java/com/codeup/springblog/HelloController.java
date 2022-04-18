package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {
  @RequestMapping(path = "add/{numOne}/and/{numTwo}")
  @ResponseBody
public Integer addNum(@PathVariable int numOne, @PathVariable int numTwo) {
      return numOne + numTwo;
  }


@GetMapping("/hello")
    @ResponseBody
    public  String hello(){
    return "Hello there from the blog.";

}
@RequestMapping(path = "/hello/{name}/ans/{age}", method = RequestMethod.GET)
@ResponseBody
    public String helloNameAge(@PathVariable String name, @PathVariable int age) {


    return "Hello three " + name + ", How is the crisp age of " + age;
}



}
