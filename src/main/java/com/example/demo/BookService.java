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
		System.out.println("Books have been retrieved.");
		return booksList;
	}

	public Book getBookByID(int id) {
		for (Book book : booksList) {
			if (book.getId() == id) {
				System.out.println("Book has been retrieved.");
				return book;
			}
		}
		return null;
	}

	public Book addBook(Book book) {
		booksList.add(book);
		System.out.println("Book has been added.");
		return book;
	}

	public Book deleteBookByID(int id) {
		for (Book book : booksList) {
			if (book.getId() == id) {
				booksList.remove(book);
				System.out.println("Book has been deleted.");
				break;
			}
		}
		return null;
	}

	public Book updateBook(Book book, int id) {
		for (Book _book : booksList) {
			if (_book.getId() == id) {
				_book.setName(book.getName());
				_book.setAuthor(book.getAuthor());
				System.out.println("Book has been updated.");
				break;
			}
		}
		return null;
	}

}
