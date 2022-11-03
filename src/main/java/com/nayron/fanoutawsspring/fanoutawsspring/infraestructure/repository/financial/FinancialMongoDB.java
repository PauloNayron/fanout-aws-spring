package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial;

import com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao.FinancialDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialMongoDB extends MongoRepository<FinancialDocument, String> {
}
