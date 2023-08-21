package com.appEC2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControllerMapping {

    @GetMapping("/controllerHTML")
    public String controller() {
        return "controllerHTML";
    }

    @RequestMapping("/controllerModel")
    public String controllerModel(Model model) {
        model.addAttribute("variable", "value");
        return "controllerModel";
    }

}
