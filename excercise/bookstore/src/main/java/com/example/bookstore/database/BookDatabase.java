package com.example.bookstore.database;

import java.util.ArrayList;
import java.util.List;

import com.example.bookstore.entities.Book;
/**
 * 
 * @author Dinh Van Chien
 * Class này ví dụ là Database
 *
 */
public class BookDatabase {
	public static List<Book> bookData() {
		List<Book> listBook = new ArrayList<Book>();
		Book book1 = new Book(1, "BookName1", "Nguyễn Văn A", 25);
		Book book2 = new Book(2, "BookName2", "Đinh Ngoc B", 300);
		Book book3 = new Book(3, "BookName3", "Trần Thi H", 100);
		listBook.add(book1);
		listBook.add(book2);
		listBook.add(book3);
		return listBook;
	}
}
