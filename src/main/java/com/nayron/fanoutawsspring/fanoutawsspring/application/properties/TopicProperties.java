package com.nayron.fanoutawsspring.fanoutawsspring.application.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Getter
@Setter
@ConfigurationProperties(prefix = "topic")
@ConfigurationPropertiesScan
public class TopicProperties {
    private String purchase;
}
