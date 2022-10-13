package com.sampleecommerce.back.apiback.infra.outputport;

import com.sampleecommerce.back.apiback.domain.Procedure;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EntityRepository {

     Procedure save(Procedure reg);
     List<Procedure> getAllByApplicantId(String applicantId);
}
