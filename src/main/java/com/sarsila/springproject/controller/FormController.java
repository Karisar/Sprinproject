package com.sarsila.springproject.controller;

import com.sarsila.springproject.model.*;

import java.io.BufferedReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.annotation.Validated;

// https://spring.io/guides/gs/handling-form-submission/
@Controller
public class FormController {

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model) {
       // model.addAttribute("greeting", new FormOlio());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    	
    	GreetingDAO dao = new GreetingMongoDaoImpl();
    	dao.save(greeting);
    	List list = dao.fetchAll();
        model.addAttribute("greeting", greeting);
        model.addAttribute("lista", list);
        return "result";
    }
}