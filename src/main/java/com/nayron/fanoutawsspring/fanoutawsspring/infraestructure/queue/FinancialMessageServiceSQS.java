package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.queue;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.FinancialService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@AllArgsConstructor
public class FinancialMessageServiceSQS {
  private FinancialService financialService;
  @SqsListener(value = "${sqs.financial-purchase}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  private void receivePurchanseMessage(@Payload Purchase purchase) {
    log.info("queue receive {}", purchase);
    financialService.addFinancialByPurchase(purchase);
  }
}
