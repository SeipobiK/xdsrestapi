package com.hie.xdsrestapi.service;


import com.hie.xdsrestapi.model.PersonIdentifier;

import java.util.List;

public interface IdentifierService {

    public List<PersonIdentifier> findIdentifier(String patientId);

    boolean hasIdentifier(String patientId);
}
