package com.nayron.fanoutawsspring.fanoutawsspring.application.controller;

import com.nayron.fanoutawsspring.fanoutawsspring.application.request.PurchaseRequest;
import com.nayron.fanoutawsspring.fanoutawsspring.application.response.PurchaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

  @PostMapping
  public PurchaseResponse createPurchase(PurchaseRequest purchaseRequest) {
    return null;
  }
}
