package com.example.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Book;

@Service
public interface BookService {
	public List<Book> findAllBook();
}
