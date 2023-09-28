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
    public String homeView() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Rust</li>" +
                        "<ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String orderFavoritesForm() {
        return "<html>" +
                    "<body>" +
                        "<form action='form' method='post'>" +
                            "<h3>Name:</h3>\n" +
                                "<input type='text' name='name'>\n" +
                            "<h3>My favorite language:</h3>\n" +
                                "<select name='faveLanguage'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Rust'>Rust</option>" +
                                "</select>" +
                            "<h3>My second favorite language:</h3>\n" +
                                "<select name='secondFave'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Rust'>Rust</option>" +
                                "</select>" +
                            "<h3>My third favorite language:</h3>\n" +
                                "<select name='thirdFave'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Rust'>Rust</option>" +
                                "</select>" +
                            "\n<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String formHandler(@RequestParam String name, @RequestParam String faveLanguage, @RequestParam String secondFave, @RequestParam String thirdFave) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + faveLanguage + "</li>" +
                            "<li>" + secondFave + "</li>" +
                            "<li>" + thirdFave + "</li>" +
                        "<ol>" +
                    "</body>" +
                "</html>";
    }
}
