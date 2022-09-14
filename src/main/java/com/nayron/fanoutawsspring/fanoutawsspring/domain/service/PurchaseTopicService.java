package com.nayron.fanoutawsspring.fanoutawsspring.domain.service;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;

public interface PurchaseTopicService {
  void publish(Purchase purchase);
}
