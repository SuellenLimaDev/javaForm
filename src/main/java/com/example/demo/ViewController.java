package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final FormRepository formRepository;

    @Autowired
    public ViewController(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @GetMapping("/list")
    public String listForms(Model model) {
        model.addAttribute("forms", formRepository.findAll());
        return "list";
    }
}
