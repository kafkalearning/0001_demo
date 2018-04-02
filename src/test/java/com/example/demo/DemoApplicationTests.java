package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.kafka.MsgSender;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableScheduling
public class DemoApplicationTests {

	@Autowired
	private MsgSender msgSender;
	
	@Test
	public void contextLoads() {
		this.msgSender.sendMsg("Michael");
	}
	
}
