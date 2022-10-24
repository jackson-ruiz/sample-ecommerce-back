package com.sampleecommerce.back.apiback.domain.repository;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProcedureRepository extends JpaRepository<Procedure, Integer> {

    //List<Procedure>findByApplicant_id(String applicant_id);
}
