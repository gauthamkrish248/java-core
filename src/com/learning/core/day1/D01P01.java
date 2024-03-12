package com.learning.core.day01;

public class D01P01 {
public static void main(String[] args){
		
		Book book = new Book();
		book.setBookTitle("Java Programming");
		book.setBookPrice(350.00);
		
		System.out.println("Book Title: "+book.getBookTitle()+" and Price: "+book.getBookPrice());
	}
}
