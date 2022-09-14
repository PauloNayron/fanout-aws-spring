package com.nayron.fanoutawsspring.fanoutawsspring.domain.service.impl;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.PurchaseService;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.PurchaseTopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
  private final PurchaseTopicService purchaseTopicService;
  @Override
  public Purchase createPurchase(Purchase purchase) {
    purchase.setId(UUID.randomUUID().toString());
    purchaseTopicService.publish(purchase);
    return purchase;
  }
}
