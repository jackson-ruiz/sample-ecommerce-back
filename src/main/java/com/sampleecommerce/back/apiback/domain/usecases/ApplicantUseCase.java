package com.sampleecommerce.back.apiback.domain.usecases;

import com.sampleecommerce.back.apiback.domain.entities.Applicant;
import com.sampleecommerce.back.apiback.domain.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ApplicantUseCase implements ApplicantInputPort{

    @Autowired
    ApplicantRepository repository;

    @Override
    public List<Applicant> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Applicant> getById(String applicantId) {
        return repository.findById(applicantId);
    }
}
