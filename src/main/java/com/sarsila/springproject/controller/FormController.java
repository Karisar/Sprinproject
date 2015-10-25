package com.sarsila.springproject.controller;

import com.sarsila.springproject.model.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// https://spring.io/guides/gs/handling-form-submission/
@Controller
public class FormController {

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new FormOlio());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute FormOlio olio, Model model, HttpServletRequest request) {
        model.addAttribute("olio", olio); // tulee nullina, yritä debugata formdata
        return "result";
    }
}