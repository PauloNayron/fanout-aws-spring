package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.repository.FinancialRepository;
import com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao.FinancialDocument;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FinancialRepositoryImpl implements FinancialRepository {
    private FinancialMongoDB financialMongoDB;
    @Override
    public Financial save(Financial financial) {
        FinancialDocument document = new FinancialDocument(financial);
        financialMongoDB.save(document);
        return document.toEntity();
    }
}
