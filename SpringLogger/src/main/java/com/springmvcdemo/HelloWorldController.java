package com.springmvcdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
       return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // Read the request parameter from the Html Form
        String theName = request.getParameter("studentName");

        //Convert the data to all Caps
        theName = theName.toUpperCase();

        //Create the message
        String result = "Hello Good Morning "+theName+" I am from version 2";

        //Add the message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }


    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        //Convert the data to all Caps
        theName = theName.toLowerCase();

        //Create the message
        String result = "Hello Good Morning "+theName+" I am from version 3";

        //Add the message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

}
