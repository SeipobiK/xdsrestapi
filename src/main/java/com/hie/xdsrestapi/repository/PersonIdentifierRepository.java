package com.hie.xdsrestapi.repository;

import com.hie.xdsrestapi.model.PersonIdentifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonIdentifierRepository extends JpaRepository<PersonIdentifier, String> {
    List<PersonIdentifier> findByPatientid(String patientid);
}
