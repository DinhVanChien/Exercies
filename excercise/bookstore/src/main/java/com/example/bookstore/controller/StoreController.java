package com.example.bookstore.controller;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.dto.PageDto;
import com.example.bookstore.dto.ResponseBase;
import com.example.bookstore.dto.StoreDto;
import com.example.bookstore.dto.StorePage;
import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.Store;
import com.example.bookstore.nativequery.StoreNative;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.repository.StoreRepository;
import com.example.bookstore.repository.sp.StoreSP;

@RestController
public class StoreController {
	private BookRepository bookRepository;
	private StoreRepository storeRepository;
	private StoreSP storeSP;
	private StoreNative storeNative;
	private static final int INITIAL_PAGE_SIZE = 5;
	@Autowired
	public StoreController(BookRepository bookRepository, StoreRepository storeRepository, 
			StoreSP storeSP, StoreNative storeNative) {
		this.bookRepository = bookRepository;
		this.storeRepository = storeRepository;
		this.storeSP = storeSP;
		this.storeNative = storeNative;
	}
	@PostMapping("/stores")
	public ResponseBase insert(@RequestBody Store store) {
		try {
			storeRepository.save(store);
			/*	for(Book b : store.getBooks()) {
					b.setStore(store);
					bookRepository.save(b);
				}
				*/
		} catch (Exception e) {
			return new ResponseBase("Them that bai","0");
		}
		
		return new ResponseBase();
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Store>> findAll() {
		List<Store> stores = storeRepository.findAll();
		return ResponseEntity.ok(stores);
		
	}
	@PostMapping("/all/{page}")
	public ResponseEntity<StorePage> findAll(@PathVariable Integer page, 
			@RequestBody StoreDto storeDto) {
		
		int totalStore = storeNative.totalStore(storeDto);
		StorePage storePage = new StorePage();
		totalStore = 0;
		if(totalStore != 0) {
			PageDto pageDto = new PageDto(totalStore, page, 3);
			storeDto.setOffset(this.offset(storeDto.getLimit(), page));
			List<Store> stores = storeNative.stores(storeDto);
			storePage.setStore(stores);
			storePage.setEndPage(pageDto.getEndPage());
			storePage.setStartPage(pageDto.getStartPage());
		} else {
		
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return ResponseEntity.ok(storePage);
	}
	
	
	@PostMapping("/all/t/{page}")
	public ResponseBase test2(@PathVariable Integer page, 
			@RequestBody StoreDto storeDto) {
		
		int totalStore = storeNative.totalStore(storeDto);
		StorePage storePage = new StorePage();
		totalStore = 0;
		if(totalStore != 0) {
			PageDto pageDto = new PageDto(totalStore, page, 3);
			storeDto.setOffset(this.offset(storeDto.getLimit(), page));
			List<Store> stores = storeNative.stores(storeDto);
			storePage.setStore(stores);
			storePage.setEndPage(pageDto.getEndPage());
			storePage.setStartPage(pageDto.getStartPage());
		} else {
		
			return new ResponseBase("Khoong co ban ghi", "0");
		}
		
		return new ResponseBase();
	}
	
	public int offset(int limit, int page) {
		if(1 == page) {
			return 0;
		} else {
			return limit * (page - 1) + 1;
		}
	}
}
