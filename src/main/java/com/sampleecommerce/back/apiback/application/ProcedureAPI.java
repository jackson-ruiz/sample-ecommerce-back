package com.sampleecommerce.back.apiback.application;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import com.sampleecommerce.back.apiback.domain.usecases.ProcedureInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcedureAPI {
    @Autowired
    ProcedureInputPort procedureInputPort;

    @GetMapping(path = "applicants/{applicantId}/procedures")
    public List<Procedure> getAllByApplicantId(@PathVariable String applicantId){
        return procedureInputPort.getAllByApplicantId(applicantId);
    }
}
