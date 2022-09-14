package com.nayron.fanoutawsspring.fanoutawsspring.domain.service.impl;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.FinancialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class FinancialServiceImpl implements FinancialService {

  @SqsListener(value = "https://sqs.us-east-1.amazonaws.com/950890890944/financial-purchase-create-sqs", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  private void receivePurchanseMessage(String message) {
    log.info("message receive {}", message);
  }
}
