package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IWishMessageConsumer;

@RestController
@RequestMapping("consumer-api")
public class ConsumerApplicationController {
	
	@Autowired
	private IWishMessageConsumer consumer;
	
	@GetMapping("/display")
	public ResponseEntity<String> displayMessage()
	{
		ResponseEntity<String> fetchWishMessage = consumer.fetchWishMessage("Satya");
		String body = fetchWishMessage.getBody();
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}

}
