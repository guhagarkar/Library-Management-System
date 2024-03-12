package com.qsp.lms_controller;

import java.util.ArrayList;
import java.util.List;

import com.qsp.lms_model.book;
import com.qsp.lms_model.library;
import com.qsp.lms_view.view;

public class Controller {
	private static library library = view.getLibrary();
	static List<book> books = library.getBooks();

	public void addBook(book book) {
		if (books == null) {
			books = new ArrayList<>();
		}
		books.add(book);
		library.setBooks(books);
	}

	public static book getBook(String bookName) {
		if (books != null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}

	public boolean removeBook(String bookName) {
		if (books!=null) {
			for (book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
					books.remove(book);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean updateBook(book bookExit,book bookUpdate) {
		if (books != null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookExit.getBookName())) {
					books.remove(bookExit);
					books.add(bookUpdate);
					return true;
				}
			}
		}
		return false;
	
	}

}
