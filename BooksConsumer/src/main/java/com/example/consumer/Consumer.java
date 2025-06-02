package com.example.consumer;

import java.math.BigDecimal;

public class Consumer {

	private Integer bookId;
	private String bookName;
	private BigDecimal bookCost;
	private BigDecimal quantity;
	private BigDecimal totalCost;
	
	public Consumer() {
		super();
	}
	public Consumer(Integer bookId, String bookName, BigDecimal bookCost, BigDecimal qunatity, BigDecimal totalCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
		this.quantity = qunatity;
		this.totalCost = totalCost;
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
	public BigDecimal getQunatity() {
		return quantity;
	}
	public void setQunatity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	
}
