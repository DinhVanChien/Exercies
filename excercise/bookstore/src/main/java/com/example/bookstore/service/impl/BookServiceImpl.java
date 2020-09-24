package com.example.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Book;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public List<Book> findAllBook() {
		return bookRepository.findAll();
	}

}
