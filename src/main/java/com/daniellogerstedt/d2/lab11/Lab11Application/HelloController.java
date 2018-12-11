package com.daniellogerstedt.d2.lab11.Lab11Application;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String homepage () {
        return "please proceed to \"/hello\"!";
    }

    @RequestMapping("/hello")
    public String hellopage () {
        return "hello world!";
    }

    @RequestMapping("/capitalize/{words}")
    public String capitalize(@PathVariable() String words){
        return words.toUpperCase();
    }

    @RequestMapping("/capitalize")
    public String capitalize(){
        return "Please add a word to capitalize like this: \"capitalize/yourwordshere\"";
    }
}
