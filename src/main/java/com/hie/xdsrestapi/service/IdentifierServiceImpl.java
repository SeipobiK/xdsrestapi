package com.hie.xdsrestapi.service;

import com.hie.xdsrestapi.model.PersonIdentifier;
import com.hie.xdsrestapi.repository.PersonIdentifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class IdentifierServiceImpl implements IdentifierService{
    @Autowired
    private PersonIdentifierRepository personIdentifierRepository;

    @Override
    public List<PersonIdentifier> findIdentifier(String patientId) {

        List<PersonIdentifier> personIdentifiers = personIdentifierRepository.findByPatientid(patientId);

        return personIdentifiers;
    }

    @Override
    public boolean hasIdentifier(String patientId) {
        List<PersonIdentifier> personIdentifiers = personIdentifierRepository.findByPatientid(patientId);

        if(personIdentifiers.size() > 0){
            return true;
        }else{
            return false;
        }
    }
}
