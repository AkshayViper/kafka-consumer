package com.kafka.Consumer.KafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class OrderCreateHandler {

	Logger logger = LoggerFactory.getLogger(OrderCreateHandler.class);
	
	@KafkaListener(id="orderConsumerClient", topics="order.created", groupId ="consumer")
	public void listen(String message) {
		
		logger.info("Payload received : {}" , message);
	}
}
