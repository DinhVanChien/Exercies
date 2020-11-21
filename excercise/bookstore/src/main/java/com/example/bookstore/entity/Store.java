package com.example.bookstore.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "store")
@EntityListeners(AuditingEntityListener.class)
public class Store extends Auditable<String> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "address")
	private String address;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
	@JsonIgnore
	private List<Book> books;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store1")
	@JsonIgnore
	private Set<Book> books2;

	public Store() {
		super();
	}

	

	public Store(Integer id, String address, List<Book> books, Set<Book> books2) {
		super();
		this.id = id;
		this.address = address;
		this.books = books;
		this.books2 = books2;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Set<Book> getBooks2() {
		return books2;
	}

	public void setBooks2(Set<Book> books2) {
		this.books2 = books2;
	}
	
}
