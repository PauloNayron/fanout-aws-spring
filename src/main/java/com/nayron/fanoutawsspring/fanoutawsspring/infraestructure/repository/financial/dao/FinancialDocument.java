package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.repository.financial.dao;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("financial")
public class FinancialDocument implements Serializable {
    @Id
    private String id;
    private Purchase purchase;
    private BigDecimal amount;

    public FinancialDocument(Financial financial) {
        this.purchase = new Purchase(financial.getPurchase());
        this.amount = financial.getAmount();
    }

    public Financial toEntity() {
        return Financial.builder()
                .purchase(this.purchase.toEntity())
                .amount(this.amount)
                .build();
    }
}
