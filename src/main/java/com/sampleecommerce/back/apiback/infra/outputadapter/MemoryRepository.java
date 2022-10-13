package com.sampleecommerce.back.apiback.infra.outputadapter;

import com.sampleecommerce.back.apiback.domain.Procedure;
import com.sampleecommerce.back.apiback.infra.outputport.EntityRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryRepository implements EntityRepository{

    @Override
    public Procedure save(Procedure reg) {
        return null;
    }

    @Override
    public List<Procedure> getAllByApplicantId(String applicantId) {
        ArrayList<Procedure> procedures = new ArrayList<Procedure>();
        procedures.add(new Procedure(1,"a", "100","tramite1"));
        procedures.add(new Procedure(2,"b", "100","tramite1"));
        procedures.add(new Procedure(3,"c", "100","tramite1"));
        procedures.add(new Procedure(4,"a", "101","tramite1"));
        procedures.add(new Procedure(5,"b", "101","tramite1"));
        procedures.add(new Procedure(6,"c", "101","tramite1"));
        return procedures;
    }
}