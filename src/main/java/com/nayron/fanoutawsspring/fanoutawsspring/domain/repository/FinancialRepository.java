package com.nayron.fanoutawsspring.fanoutawsspring.domain.repository;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;

import java.util.List;

public interface FinancialRepository {
    Financial save(Financial financial);

    List<Financial> getAll();

    Financial getById(String id);
}
