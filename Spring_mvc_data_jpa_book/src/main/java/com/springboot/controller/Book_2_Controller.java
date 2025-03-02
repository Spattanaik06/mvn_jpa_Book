package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.entity.Book;
import com.springboot.repository.BookRepo;

public class Book_2_Controller 
{
	@Autowired
	private BookRepo bookRepo;
	
	public ModelAndView getAllBook(Book book)
	{
		ModelAndView mvn =new ModelAndView();
		bookRepo.findAll();
		mvn.addObject("books","All books");
		mvn.setViewName("bookView");
		return mvn;
	}
}
