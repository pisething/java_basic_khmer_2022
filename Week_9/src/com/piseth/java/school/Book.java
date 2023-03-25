package com.piseth.java.school;

public class Book {
	private String title;
	private double price;

	public Book() {
		this("Khmer",20.5);
		System.out.println("My constructor");
	}

	public Book(String title) {
		//this.title = title;
		//this.price = 10;
		this(title, 15);
		
	}
	
	public Book(String title, double price) { // reuse
		this.title = title;
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
