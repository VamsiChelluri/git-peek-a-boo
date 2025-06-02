package com.example.producer;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private BigDecimal bookCost;
	public Book() {
		super();
		
	}
	public Book(Integer bookId, String bookName, BigDecimal bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BigDecimal getBookCost() {
		return bookCost;
	}
	public void setBookCost(BigDecimal bookCost) {
		this.bookCost = bookCost;
	}

}
