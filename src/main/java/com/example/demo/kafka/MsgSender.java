package com.example.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgSender {
	
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	public void sendMsg(String msg) {
		this.kafkaTemplate.send("test", msg);
	}
	
}
