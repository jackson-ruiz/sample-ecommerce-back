package com.sampleecommerce.back.apiback.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Applicant {

    @Id
    private String id;
    private String name;
    private LocalDate birth_date;

    @OneToMany(mappedBy = "applicant")
    @JsonIgnore
    private List<Procedure> procedures;

    public Applicant(){}

    public Applicant(String id, String name, LocalDate birth_date) {
        this.id = id;
        this.name = name;
        this.birth_date=birth_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }
}
