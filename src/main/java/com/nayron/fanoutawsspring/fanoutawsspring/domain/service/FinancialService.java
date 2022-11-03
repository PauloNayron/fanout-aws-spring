package com.nayron.fanoutawsspring.fanoutawsspring.domain.service;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao.FinancialDocument;

public interface FinancialService {
    Financial addFinancial(Financial financial);

    Financial addFinancialByPurchase(Purchase purchase);
}
