package com.example.producer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Integer> {

	public Book findByBookName(String bookname);
}
