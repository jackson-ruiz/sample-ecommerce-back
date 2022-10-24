package com.sampleecommerce.back.apiback.application;

import com.sampleecommerce.back.apiback.domain.entities.Procedure;
import com.sampleecommerce.back.apiback.domain.usecases.ProcedureInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProcedureAPI {
    @Autowired
    ProcedureInputPort procedureInputPort;

    @GetMapping(path = "applicants/{applicantId}/procedures")
    public List<Procedure> getAllByApplicantId(@PathVariable String applicantId){
        return procedureInputPort.getAllByApplicantId(applicantId);
    }

    @PostMapping(path = "applicants/{applicantId}/procedures")
    public ResponseEntity<Procedure> create(@PathVariable String applicantId, @RequestBody Procedure procedure){
        Procedure savedProcedure = procedureInputPort.createProcedure(applicantId, procedure);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedProcedure.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
