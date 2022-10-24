package com.sampleecommerce.back.apiback.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Procedure {
    @Id
    @GeneratedValue
    private int id;
    private String procedure_type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Applicant applicant;
    private String description;
    private LocalDateTime creation_date;

    protected Procedure(){}
    public Procedure(int id, String procedure_type, Applicant applicant, String description) {
        super();
        this.id = id;
        this.procedure_type = procedure_type;
        this.applicant = applicant;
        this.description = description;
        this.creation_date = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcedure_type() {
        return procedure_type;
    }

    public void setProcedure_type(String procedure_type) {
        this.procedure_type = procedure_type;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", procedureType='" + procedure_type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
