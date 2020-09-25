package com.example.bookstore.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bookstore.entity.Book;

@Repository
public interface BookRepository {
	public List<Book> findAll();
}
