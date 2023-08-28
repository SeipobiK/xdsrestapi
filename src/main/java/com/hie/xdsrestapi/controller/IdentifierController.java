package com.hie.xdsrestapi.controller;


import com.hie.xdsrestapi.model.PersonIdentifier;
import com.hie.xdsrestapi.service.IdentifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IdentifierController {
    @Autowired
    private IdentifierService identifierService;

    @GetMapping("/personidentifier/{patientId}")
    public List<PersonIdentifier> findIdentifier(@PathVariable("patientId") String patientId){
        return identifierService.findIdentifier(patientId);
    }

    @GetMapping("/hasIdentifier/{patientId}")
    public boolean hasIdentifier(@PathVariable("patientId") String patientId){
        return identifierService.hasIdentifier(patientId);
    }



}
