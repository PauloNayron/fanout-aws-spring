package com.nayron.fanoutawsspring.fanoutawsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(
				exclude = {
								org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration.class,
								org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration.class,
								org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration.class
				}
)
@ConfigurationPropertiesScan("com.nayron.fanoutawsspring.fanoutawsspring.application.properties")
public class FanoutAwsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanoutAwsSpringApplication.class, args);
	}

}
