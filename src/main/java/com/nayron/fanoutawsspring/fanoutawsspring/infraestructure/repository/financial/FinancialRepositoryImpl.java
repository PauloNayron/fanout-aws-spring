package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.repository.FinancialRepository;
import com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao.FinancialDocument;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public List<Financial> getAll() {
        var financialDocumentAll = financialMongoDB.findAll();
        return financialDocumentAll.stream()
                .map(FinancialDocument::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public Financial getById(String id) {
        Optional<FinancialDocument> document = financialMongoDB.findById(id);
        return document.map(FinancialDocument::toEntity)
                .orElseThrow(() -> new RuntimeException("Financial".concat(id).concat("does not exists")));
    }
}
