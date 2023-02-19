package com.example.demo;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@Autowired
	private BookService bookService;

	// @RequestMapping(value = "/books", method = RequestMethod.GET)
	@GetMapping(value = "/books")
	public List<Book> getBooks() {
		return this.bookService.getBooks();
	}

	@GetMapping(value = "/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.bookService.getBookByID(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	@DeleteMapping(value = "/books/{id}")
	public Book deleteBookById(@PathVariable("id") int id) {
		return this.bookService.deleteBookByID(id);
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		return this.bookService.updateBook(book, id);
	}
}
