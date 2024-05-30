package com.SpringDataJPA.SpringDataJPA.Service;

import com.SpringDataJPA.SpringDataJPA.Model.Section;
import com.SpringDataJPA.SpringDataJPA.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SectionService {

    @Autowired
    SectionRepository sectionRepository;

    public Section findByName( String name){

        return sectionRepository.findByName(name);
    }



}
