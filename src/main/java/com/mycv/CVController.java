package com.mycv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class CVController {

    @GetMapping("/examples")
    public String showExamplePage(){

        //do some stuff
        return "examples";
    }

    @GetMapping("/profile")
    public String showProfile(){
        return "profile";
    }

    @GetMapping("/education")
    public String showEducation(){
        return "education";
    }
    @GetMapping("/lang")
    public String showLanguages(){
        return "lang";
    }
    @GetMapping("/superpowers")
    public String showSuperpowers(){
        return "superpowers";
    }
    @GetMapping("/work")
    public String showWorkExperience(){
        return "work";
    }
}
