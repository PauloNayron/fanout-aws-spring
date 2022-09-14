package com.nayron.fanoutawsspring.fanoutawsspring.application.response;

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
public class PurchaseResponse {
  private String id;
  private String productId;
  private Long quantity;

  public PurchaseResponse(Purchase purchase) {
    this.id = purchase.getId();
    this.productId = purchase.getProductId();
    this.quantity = purchase.getQuantity();
  }
}
