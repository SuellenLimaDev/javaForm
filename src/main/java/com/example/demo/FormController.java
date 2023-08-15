package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/forms")
public class FormController {
    private final FormRepository formRepository;

    @Autowired
    public FormController(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @GetMapping
    public List<FormEntity> getAllForms() {
        return formRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FormEntity> getFormById(@PathVariable int id) {
        return formRepository.findById(id);
    }

    @PostMapping
    public FormEntity createForm(@RequestBody FormEntity formEntity) {
        return formRepository.save(formEntity);
    }
}
