package com.nayron.fanoutawsspring.fanoutawsspring.application.request;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {
  private String productId;
  private Long quantity;

  public Purchase toEntity() {
    return Purchase.builder().productId(productId).quantity(quantity).build();
  }
}
