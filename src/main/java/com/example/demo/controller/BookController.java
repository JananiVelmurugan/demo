package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("books")
public class BookController {

	@GetMapping
	public List<String> list() {
		List<String> books = new ArrayList<>();
		books.add("Java");
		books.add("C");
		return books;

	}
}
