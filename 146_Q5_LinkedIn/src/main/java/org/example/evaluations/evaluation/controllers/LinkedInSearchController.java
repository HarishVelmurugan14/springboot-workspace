package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linkedInSearch")
public class LinkedInSearchController {

    @Autowired
    private ISearchService searchService;

    @GetMapping("/harish")
    public String test(){
        return "Yooo";
    }
}
