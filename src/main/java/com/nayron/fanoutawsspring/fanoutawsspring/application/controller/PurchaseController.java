package com.nayron.fanoutawsspring.fanoutawsspring.application.controller;

import com.nayron.fanoutawsspring.fanoutawsspring.application.request.PurchaseRequest;
import com.nayron.fanoutawsspring.fanoutawsspring.application.response.PurchaseResponse;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/purchase")
@AllArgsConstructor
public class PurchaseController {
  private final PurchaseService purchaseService;

  @PostMapping
  public PurchaseResponse createPurchase(@RequestBody PurchaseRequest purchaseRequest) {
    return new PurchaseResponse(purchaseService.createPurchase(purchaseRequest.toEntity()));
  }
}
