package com.fdmgroup;

// creates a class to store items in cart arraylist
public class Book{
    private Double price;
	private String title;

	public Book(String title,Double price){
    	this.title = title;
    	this.price = price;
    }

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	   @Override
	   public String toString() {
	        return ("Title: "+this.getTitle()+
	                    " Price: "+ this.getPrice());
	   }
	   
}