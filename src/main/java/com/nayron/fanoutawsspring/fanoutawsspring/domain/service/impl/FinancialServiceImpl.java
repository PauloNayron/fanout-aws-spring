package com.nayron.fanoutawsspring.fanoutawsspring.domain.service.impl;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.repository.FinancialRepository;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.FinancialService;
import com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao.FinancialDocument;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class FinancialServiceImpl implements FinancialService {
    private FinancialRepository financialRepository;

    @Override
    public Financial addFinancial(Financial financial) {
        return financialRepository.save(financial);
    }

    @Override
    public Financial addFinancialByPurchase(Purchase purchase) {
        var financial = Financial.builder()
                .purchase(purchase)
                .amount(BigDecimal.TEN)
                .build();
        return this.addFinancial(financial);
    }
}
