package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {

	private static List<Book> booksList = new ArrayList<>();

	static {
		booksList.add(new Book(1, "name1", "author1"));
		booksList.add(new Book(2, "name2", "author2"));
		booksList.add(new Book(3, "name3", "author3"));
	}

	public List<Book> getBooks() {
		return booksList;
	}
	
	public Book getBookByID(int id) {
		for (Book book : booksList) {
			if(book.getId() == id) {
				return book;
			}	
		}
		return null;
	}
	
}
