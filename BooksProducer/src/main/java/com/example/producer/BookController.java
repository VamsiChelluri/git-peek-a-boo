package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

	@Autowired BooksRepository booksRepo;
	@GetMapping("/bookservice/getbookcost/{bookname}")
	public Book retrieveBookCost(@PathVariable String bookname) {
		
		Book book = booksRepo.findByBookName(bookname);
		if(book==null) {
			throw new BookNotFoundException("Book-"+bookname+" Not Found");
		}
		return book;
	}
	
	
}
