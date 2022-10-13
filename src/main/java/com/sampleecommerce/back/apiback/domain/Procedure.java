package com.sampleecommerce.back.apiback.domain;

public class Procedure {
    private int id;
    private String procedureType;
    private String applicantId;
    private String description;

    public Procedure(int id, String procedureType, String applicantId, String description) {
        this.id = id;
        this.procedureType = procedureType;
        this.applicantId = applicantId;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcedureType() {
        return procedureType;
    }

    public void setProcedureType(String procedureType) {
        this.procedureType = procedureType;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", procedureType='" + procedureType + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
