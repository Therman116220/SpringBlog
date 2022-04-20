package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
            public String postView(@PathVariable )
}

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable ) {
return "e";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreate() {
    return "create a new post";
}
}
