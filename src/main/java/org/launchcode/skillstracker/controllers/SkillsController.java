package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String getLandingPage(){
        String html = "<html>" + "<body>" +
                "<h1>" + "Skills Tracker" + "</h1>" +
                "<h2>" + "We have a few skills we would like to learn. Here is the list!" + "</h2>"+
                "<ol>" +
                "<li>" + "Java" + "</li>" +
                "<li>" + "JavaScript" + "</li>" +
                "<li>" + "Python" + "</li>" +
                "</ol>" +
                "</body>" + "</html>";
        return html;
    }

    @GetMapping("/form")
    @ResponseBody
    public String getForm(){
        String html =
                "<html>" +
                    "<body>" +
                        "<form method = 'POST' action = '/completeform'>" +
                            "Name: <br/>" +
                            "<input type = 'text' name = 'name'/><br/>" +
                            "My favorite language: <br/>" +
                            "<select name = 'lang1'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select> <br/>" +
                            "My second favorite language: <br/>" +
                            "<select name = 'lang2'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select> <br/>" +
                            "My third favorite language: <br/>" +
                            "<select name = 'lang3'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select> <br/>" +
                            "<input type = 'submit' value = 'Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @PostMapping("/completeform")
    @ResponseBody
    public String postFromPage(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        String html = "<html>" + "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th> Favorite Language </th>" +
                "<th>" + lang1 + "</th>" +
                "</tr>" +
                "<tr>" +
                "<th> Second Favorite Language </th>" +
                "<th>" + lang2 + "</th>" +
                "</tr>" +
                "<tr>" +
                "<th> Third Favorite Language </th>" +
                "<th>" + lang3 + "</th>" +
                "</tr>" +
                "</table>" +
                "</body>" + "</html>";
        return html;
    }
}
