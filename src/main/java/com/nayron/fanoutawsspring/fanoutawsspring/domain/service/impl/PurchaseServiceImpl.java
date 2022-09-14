package com.nayron.fanoutawsspring.fanoutawsspring.domain.service.impl;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService {
  @Override
  public Purchase createPurchase(Purchase purchase) {
    purchase.setId(UUID.randomUUID().toString());
    return purchase;
  }
}
