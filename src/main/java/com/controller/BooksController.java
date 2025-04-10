package com.controller;

import com.service.BooksService;

public class BooksController {

	public static void main(String[] args) {
		BooksService bs = new BooksService();
		bs.InsertData();
		System.out.println("Data Inserted Successufully!");
	}
	
}
