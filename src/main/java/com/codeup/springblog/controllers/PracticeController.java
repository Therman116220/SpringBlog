/**/
package com.codeup.springblog.controllers;


        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;


@Controller
public class PracticeController {


    @GetMapping("/controller")   /*Shortcut for @RequestMapping(method = Requestmapping.GET)*/
    @ResponseBody
    public  String hello(){
        return "Controllers are getting easier and easier with time.";

    }
   }
/*--------------------------------------------------------------------------------------------------------------------*/
/*@GetMapping*/  /*Shortcut for @RequestMapping(method = Requestmapping.GET)*/
/*@PostMapping*/ /*Shortcut for @RequestMapping(method = Requestmapping.POST)*/
/*@PutMapping*/  /*Shortcut for @RequestMapping(method = Requestmapping.PUT)*/
/*@DeleteMapping*/ /*Shortcut for @RequestMapping(method = Requestmapping.DELETE)*/