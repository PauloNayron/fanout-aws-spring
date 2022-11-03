package com.nayron.fanoutawsspring.fanoutawsspring.infraestructure.topic;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Purchase;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.PurchaseTopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseTopicServiceSNS implements PurchaseTopicService {
  private final AmazonSNSClient amazonSNSClient;
  private ObjectMapper objectMapper;
  @Override
  public void publish(Purchase purchase) {
    try {
      PublishRequest publishRequest = new PublishRequest(
              "arn:aws:sns:us-east-1:950890890944:purchase-topic",
              objectMapper.writeValueAsString(purchase)
      );
      amazonSNSClient.publish(publishRequest);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
