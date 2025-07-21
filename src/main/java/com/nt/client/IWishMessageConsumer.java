package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Wish-Message")
public interface IWishMessageConsumer {

	@GetMapping("/wish-api/wish/{user}")
	public ResponseEntity<String> fetchWishMessage(@PathVariable String user);
	
}
