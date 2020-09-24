package com.example.bookstore.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.entities.Book;
import com.example.bookstore.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@GetMapping("/all")
	private List<Book> findAllBook() {
		return bookService.findAllBook();
	}
}
