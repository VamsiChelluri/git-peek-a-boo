package com.example.consumer;



import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired ProducerProxy proxy;
	@GetMapping("/studentservice/findCost/{bookname}/quantity/{quantity}")
	public ResponseEntity<Consumer> calculateTotalCost(@PathVariable String bookname, @PathVariable BigDecimal quantity) {
		Consumer consumer = proxy.retrieveBookCost(bookname);
		if(consumer==null) {
			throw new BookNotFoundException("Book-"+bookname+" Not Found");
		}
		return new ResponseEntity<Consumer>( new Consumer(consumer.getBookId(),
				bookname,consumer.getBookCost(),quantity,
				quantity.multiply(consumer.getBookCost())),HttpStatus.FOUND);
		
	}
}

