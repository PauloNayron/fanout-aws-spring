package com.nayron.fanoutawsspring.fanoutawsspring.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Financial {
    private Purchase purchase;
    private BigDecimal amount;
}
