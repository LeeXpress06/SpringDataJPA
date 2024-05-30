package com.SpringDataJPA.SpringDataJPA.Controller;

import com.SpringDataJPA.SpringDataJPA.Model.Section;
import com.SpringDataJPA.SpringDataJPA.Service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/name")
    public Section getSectionByName(@RequestParam  String name){
       return sectionService.findByName(name);
    }











}
