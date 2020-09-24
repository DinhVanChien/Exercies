package com.example.bookstore.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bookstore.database.BookDatabase;
import com.example.bookstore.entities.Book;
import com.example.bookstore.repository.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository{

	@Override
	public List<Book> findAll() {
		return BookDatabase.bookData();
	}
}
