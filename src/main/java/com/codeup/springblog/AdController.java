package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
    private final PostRepository adDao;

    public AdController(PostRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ad")
    public String getAd(Model model){

        model.addAttribute("ads",adDao.findAll());
        return "adPage";

    }
}
