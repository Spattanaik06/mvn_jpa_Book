package com.springboot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Table_mvc_jpa1")
public class Book 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	
	private String bookNameString;
	private String bookAuthorString;
	private Double bookPriceDouble;
	
	
	public Book() 
	{
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	
	
	public Book(Integer bookId, String bookNameString, String bookAuthorString, Double bookPriceDouble)
	{
		super();
		this.bookId = bookId;
		this.bookNameString = bookNameString;
		this.bookAuthorString = bookAuthorString;
		this.bookPriceDouble = bookPriceDouble;
		
	}
	
	
	
	
	
		public int getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getBookNameString() {
			return bookNameString;
		}
		public void setBookNameString(String bookNameString) {
			this.bookNameString = bookNameString;
		}
		public String getBookAuthorString() {
			return bookAuthorString;
		}
		public void setBookAuthorString(String bookAuthorString) {
			this.bookAuthorString = bookAuthorString;
		}
		public Double getBookPriceDouble() {
			return bookPriceDouble;
		}
		public void setBookPriceDouble(Double bookPriceDouble) {
			this.bookPriceDouble = bookPriceDouble;
		}



		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookNameString=" + bookNameString + ", bookAuthorString="
					+ bookAuthorString + ", bookPriceDouble=" + bookPriceDouble + "]";
		}
		
		
		
	
	
	
}
