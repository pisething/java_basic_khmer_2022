package com.piseth.java.school;

import java.util.Arrays;
import java.util.Collections;

public class BookApplication {

	public static void main(String[] args) {
		int numberOfBook = 3;
		BookService bookService = new BookService();
		Book[] books = bookService.createBooks(numberOfBook);
		System.out.println("==============");
		bookService.print(books);
		System.out.println("==============");
		//bookService.sort(books);
		//Arrays.sort(books);
		//bookService.print(books);
		
		double totalAmount = bookService.totalAmount(books);
		System.out.println("Total amount = " + totalAmount);
		
	}

}
