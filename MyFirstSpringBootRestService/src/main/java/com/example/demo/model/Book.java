package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement

public class Book {

	private String bookName;
	private String bookAuthor;
	private int releaseYear;
	private double price;
	
	
	public Book()
	{
		
	}
	
	public Book(String bookName, String bookAuthor, int releaseYear, double price) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.releaseYear = releaseYear;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", releaseYear=" + releaseYear + ", price="
				+ price + "]";
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
