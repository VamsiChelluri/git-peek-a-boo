package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="book-producer")
public interface ProducerProxy {

	
	@GetMapping("/bookservice/getbookcost/{bookname}")
	public Consumer retrieveBookCost(@PathVariable String bookname);

}
