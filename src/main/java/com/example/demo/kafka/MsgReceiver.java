package com.example.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgReceiver {

	@KafkaListener(topics="test")
	public void processMessage(String content) {
		System.out.println("content = " + content);
	}
}
