package com.restbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restbook.dao.BookRepository;
import com.restbook.entity.Book;

@Service
public class BookSerivce
{
	@Autowired
	private BookRepository bookRepository;
		
	//get all books
	public List<Book> getAllBooks()
	{
		List<Book> findAll = (List<Book>)this.bookRepository.findAll();
		return findAll;
	}
	
	// get single book by id
	public Book getBookById(int id)
	{		
		Book findById = this.bookRepository.findById(id);
		
		return findById;
	}
	
	// adding the book
	public Book addBook(Book b)
	{
		Book save = this.bookRepository.save(b);
		return save;
	}
	
//	deleting book
	public void deleteBook(int id)
	{
		this.bookRepository.deleteById(id);
	}
	
	//update Book
	public void updateBook(Book book, int id)
	{
		book.setId(id);
		bookRepository.save(book);
	}
	
}
