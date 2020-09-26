package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
public class BookController {
	
	
	@GetMapping("/book/all")
    public List<Book> findAll() {
    	Book b1 = new Book("mybook", "unknown", 2070, 8888.99);
		Book b2 = new Book("mybook", "unknown", 2070, 8888.99);
		List<Book> booksList = new ArrayList();
		booksList.add(b1);
		booksList.add(b2);
		return booksList;
    }
	

}
