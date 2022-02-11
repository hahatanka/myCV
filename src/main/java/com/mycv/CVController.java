package com.mycv;

import model.Hobby;
import model.Pet;
import model.PetType;
import model.Superpower;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller

public class CVController {

    @GetMapping("/contact")
    public String handleContactSubmission(
            Model model,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "emailAddress", required = false) String email,
            @RequestParam(name = "messageType", required = false) String messageType,
            @RequestParam(name = "message", required = false) String message
    ){
        System.out.println("new message from " + name + " " + email + " " + messageType + " " + message);

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("messageType", messageType);

        return "success";
    }

    @GetMapping("/examples")
    public String showExamplePage(){

        //do some stuff
        return "examples";
    }

    @GetMapping("/profile")
    public String showProfile(Model model){
        model.addAttribute("userName","Anna");
        model.addAttribute("location","Riga");
        model.addAttribute("age","31");
        model.addAttribute("myPet", new Pet("Sonja", 7, PetType.DOG));

        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(new Hobby("photography"));
        hobbies.add(new Hobby("eating"));
        hobbies.add(new Hobby("reading"));
        hobbies.add(new Hobby("running"));
        model.addAttribute("myHobbies", hobbies);

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
    public String showSuperpowers(Model model){
        List<Superpower> powers = new ArrayList<>();
        powers.add(new Superpower("Eating a lot"));
        powers.add(new Superpower("Watching Movies 24/7"));
        powers.add(new Superpower("Editing photos all night"));
        powers.add(new Superpower("Can draw you a six pack in Photoshop"));
        model.addAttribute("myPowers", powers);

        return "superpowers";
    }

    @GetMapping("/work")
    public String showWorkExperience(){
        return "work";
    }
}
