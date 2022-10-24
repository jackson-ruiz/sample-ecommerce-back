package com.sampleecommerce.back.apiback.domain.usecases;

import com.sampleecommerce.back.apiback.domain.entities.Applicant;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ApplicantInputPort {
    List<Applicant> getAll();
    Optional<Applicant> getById(String applicantId);
}
