package com.sampleecommerce.back.apiback.domain.usecases;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProcedureInputPort {

     Procedure createProcedure(String procedureType, String applicantId, String description);
     List<Procedure>getAllByApplicantId(String applicantId);
}
