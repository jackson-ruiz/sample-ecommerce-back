package com.sampleecommerce.back.apiback.domain.repository;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EntityRepository {

     Procedure save(Procedure reg);
     List<Procedure> getAllByApplicantId(String applicantId);
}
