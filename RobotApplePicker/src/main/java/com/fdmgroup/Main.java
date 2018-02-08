package com.fdmgroup;

public class Main {
	private static Basket basket;
	private Book book1;
	private static Checkout checkout;
	
	
	public static void main(String[] args) {
		Book book1 = new Book("hell fire fury", 28.00);
		Book book2 = new Book("Davinchi", 7.99);
		Book book3 = new Book("World War Z", 14.99);
		basket = new Basket();
		checkout = new Checkout();
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		
		
		System.out.println(basket.getBooks());
		System.out.println(checkout.getBooksTest(basket));

	}

}
