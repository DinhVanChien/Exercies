package com.example.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstore.entity.Book;

@Service
public interface BookService {
	public List<Book> findAllBook();
}
