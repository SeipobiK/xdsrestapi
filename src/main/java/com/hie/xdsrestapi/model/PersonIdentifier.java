package com.hie.xdsrestapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personidentifier")
public class PersonIdentifier {
    @Id
    private String patientid;
    private String registrypatientid;
    private String assigningauthority;
    private String deleted;
    private String merged;
    private String survivingpatientid;

}
