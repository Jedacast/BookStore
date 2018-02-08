package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	List<Book> basket = new ArrayList<Book>();	

	public void addBook(Book store) {
		basket.add(store);
	}

	public int arraySize(Basket b) {
		int itemCount = basket.size();
		return itemCount;
	}

	public List<Book> getList() {
		 return basket;
	}
	
	
	public String getBooks(){

        String allBooks = basket.toString();

        return allBooks;

    }
}
