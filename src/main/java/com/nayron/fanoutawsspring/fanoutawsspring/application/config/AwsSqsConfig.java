package com.nayron.fanoutawsspring.fanoutawsspring.application.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSqsConfig {
  @Value("${cloud.aws.region.static}") private String region;
  @Value("${cloud.aws.credentials.access-key}") private String awsAccessKey;
  @Value("${cloud.aws.credentials.secret-key}") private String awsSecretKey;

  @Bean
  public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
    return new QueueMessagingTemplate(this.amazonSQSAsync());
  }

  public AmazonSQSAsync amazonSQSAsync() {
    AmazonSQSAsyncClientBuilder amazonSQSAsyncClientBuilder = AmazonSQSAsyncClientBuilder.standard();
    AmazonSQSAsync amazonSQSAsync = null;
    amazonSQSAsyncClientBuilder.withRegion(Regions.US_EAST_1);
    BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(awsAccessKey, awsSecretKey);
    amazonSQSAsyncClientBuilder.withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials));
    amazonSQSAsync = amazonSQSAsyncClientBuilder.build();
    return amazonSQSAsync;
  }
}
