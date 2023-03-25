package com.piseth.java.school;

public class BookService {
	
	public Book[] createBooks(int n) {
		Book[] books = new Book[n];
		for(int i=0; i<n; i++) {
			books[i] = createBook();
		}
		return books;
	}
	
	public Book createBook() {
		//input title, author, price
		
		//please input title: Java
		//please input author: Dara
		//please input price: 25
		String title = Utils.getString("please input title:");
		String author = Utils.getString("please input author:");
		double price = Utils.getDouble("please input price:");
		Book book = new Book(title, author, price);
		
		return book;
	}
	
	public void print(Book[] books) {
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	public double totalAmount(Book[] books) {
		double total =0;
		for(Book b : books) {
			total += b.getPrice();
		}
		return total;
	}
	
	/*
	public void sort(Book[] books) {
		for(int i=0; i<books.length; i++) {
			for(int j=i+1; j<books.length; j++) {
				if(books[i].getPrice() > books[j].getPrice()) {
					Book tmp = books[i];
					books[i] = books[j];
					books[j] = tmp;
				}
			}
		}
	}
	*/
}
