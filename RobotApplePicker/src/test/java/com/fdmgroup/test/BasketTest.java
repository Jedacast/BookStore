package com.fdmgroup.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.Basket;
import com.fdmgroup.Book;
import com.fdmgroup.Checkout;


public class BasketTest {

	private Basket basket;
	private Book book1;
	private Checkout checkout;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Book book1 = new Book("hell fire fury", 15.00);
		basket = new Basket();

	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testThatBasketHasZeroBookInitially() {
		assertTrue(basket.arraySize(basket)==0);
	}
	
	@Test
	public void testThatBasketHasOneBooksInBasketAfterAddingOne() {
		basket.addBook(book1);
		assertTrue(basket.arraySize(basket)==1);
	}
	
	@Test
	public void testThatBasketHasThreeBooksInBasketAfterAddingThree() {
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		//checkout.showBooks(basket);
		assertTrue(basket.arraySize(basket)==3);
	}

}
