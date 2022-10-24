package com.sampleecommerce.back.apiback.domain.usecases;

import com.sampleecommerce.back.apiback.domain.entities.Applicant;
import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import com.sampleecommerce.back.apiback.domain.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Component
public class ProcedureUseCase implements ProcedureInputPort {

    @Autowired
    ProcedureRepository procedureRepository;
    @Autowired
    ApplicantInputPort applicantInputPort;

    @Override
    public Procedure createProcedure(String applicantId, Procedure procedure) {
        Optional<Applicant> applicant = applicantInputPort.getById(applicantId);
        procedure.setApplicant(applicant.get());
        return procedureRepository.save(procedure);
    }

    @Override
    public List<Procedure> getAllByApplicantId(String applicantId) {
        Optional<Applicant> applicant = applicantInputPort.getById(applicantId);
        return applicant.get().getProcedures();
    }
}
