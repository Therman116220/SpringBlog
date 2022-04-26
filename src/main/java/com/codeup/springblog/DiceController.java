package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {
    @GetMapping("/roll-dice/")
    public String sayHi(){
        return"rollDiceView";
    }

    @GetMapping("/roll-dice/{n}")
    public String guessNumber(Model model, @PathVariable int n){

        model.addAttribute("guessNumber",n);

        int randomNumber = (int)Math.floor(1+Math.random()*6);
        model.addAttribute("actualNumber",randomNumber);



        return"rollDiceView";
    }





}

