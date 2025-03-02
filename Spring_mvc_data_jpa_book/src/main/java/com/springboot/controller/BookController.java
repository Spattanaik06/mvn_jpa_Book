package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Book;
import com.springboot.repository.BookRepo;

@RestController
@RequestMapping("/book")
public class BookController
{
	@Autowired
	private BookRepo bookRepo;
	
		
	
	//List<Book> book=Arrays.asList(b1,b2);
	
	Book b2=new Book();
	@PostMapping("/booklist")
	public Book getAllBook( Book b2)
	{
		
		b2.setBookNameString("A half baked love Story");
		b2.setBookAuthorString("Anurag Garg");
		b2.setBookPriceDouble(345.00);
		Book save = bookRepo.save(b2);
		
		return save; 
	}
	@GetMapping("/allbooks")
	public void listAllBook()
	{
		List<Book> list = bookRepo.findAll();
		list.forEach(s->System.out.println(s));
	}
	
}
