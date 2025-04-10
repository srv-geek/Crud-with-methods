package com.service;

import com.dao.BooksDao;

public class BooksService {

	public void InsertData() {
		BooksDao bd = new BooksDao();
		bd.InsertData();
	}
}
