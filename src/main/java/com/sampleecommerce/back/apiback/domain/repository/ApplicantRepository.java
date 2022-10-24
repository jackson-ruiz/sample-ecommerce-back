package com.sampleecommerce.back.apiback.domain.repository;

import com.sampleecommerce.back.apiback.domain.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ApplicantRepository extends JpaRepository<Applicant, String> {
}
