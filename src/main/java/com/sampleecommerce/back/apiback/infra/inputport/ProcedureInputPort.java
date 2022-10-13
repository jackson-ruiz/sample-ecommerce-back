package com.sampleecommerce.back.apiback.infra.inputport;

import com.sampleecommerce.back.apiback.domain.Procedure;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProcedureInputPort {

     Procedure createProcedure(String procedureType, String applicantId, String description);
     List<Procedure>getAllByApplicantId(String applicantId);
}
