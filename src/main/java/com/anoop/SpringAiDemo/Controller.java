package com.anoop.SpringAiDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("hello")
public class Controller {

    @GetMapping("/greet")
    public String greet() {
        return new String("Good Morning, How are you");
    }

    @GetMapping()
    public String greeString() {
        return "this is home page";
    }

    //  add a comment

}
