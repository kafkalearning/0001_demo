package com.example.demo.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
	
	/**
	 * 
	If the broker supports it (1.0.0 or higher), the admin will increase the number of partitions 
	if it is found that an existing topic has fewer partitions than the NewTopic.numPartitions.
	 * @return
	 */
	@Bean
	public NewTopic newTopic() {
		return new NewTopic("test", 3, (short)2);
	}
	
}
