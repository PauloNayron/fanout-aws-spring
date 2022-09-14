package com.nayron.fanoutawsspring.fanoutawsspring.domain.service.impl;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.FinancialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FinancialServiceImpl implements FinancialService {

  @SqsListener(value = "${sqs.financial-purchase}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  private void receivePurchanseMessage(String message) {
    log.info("message receive {}", message);
  }
}
