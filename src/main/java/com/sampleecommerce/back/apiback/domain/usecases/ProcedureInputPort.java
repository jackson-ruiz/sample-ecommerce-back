package com.sampleecommerce.back.apiback.domain.usecases;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProcedureInputPort {

     Procedure createProcedure(String applicantId, Procedure procedure);
     List<Procedure>getAllByApplicantId(String applicantId);
}
