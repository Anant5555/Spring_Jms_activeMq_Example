package com.example.resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "QueueInMemory")
	public void listener(String message) {
		
		System.out.println("Received Message:"+message);
		
	}
	
}
