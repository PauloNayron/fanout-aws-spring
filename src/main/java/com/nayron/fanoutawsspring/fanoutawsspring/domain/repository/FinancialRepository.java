package com.nayron.fanoutawsspring.fanoutawsspring.domain.repository;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;

public interface FinancialRepository {
    Financial save(Financial financial);
}
