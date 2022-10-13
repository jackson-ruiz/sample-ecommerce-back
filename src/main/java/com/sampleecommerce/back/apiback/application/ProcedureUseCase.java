package com.sampleecommerce.back.apiback.application;

import com.sampleecommerce.back.apiback.domain.Procedure;
import com.sampleecommerce.back.apiback.infra.inputport.ProcedureInputPort;
import com.sampleecommerce.back.apiback.infra.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProcedureUseCase implements ProcedureInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Procedure createProcedure(String procedureType, String applicantId, String description) {
        return null;
    }

    @Override
    public List<Procedure> getAllByApplicantId(String applicantId) {
        return entityRepository.getAllByApplicantId(applicantId);
    }
}
