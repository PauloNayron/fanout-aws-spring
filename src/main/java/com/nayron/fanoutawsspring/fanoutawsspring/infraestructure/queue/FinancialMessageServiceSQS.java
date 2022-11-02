package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.queue;

import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class FinancialMessageServiceSQS {
  @SqsListener(value = "${sqs.financial-purchase}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  private void receivePurchanseMessage(String message) {
    log.info("queue receive {}", message);
  }
}
