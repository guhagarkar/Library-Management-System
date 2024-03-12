package com.qsp.lms_model;

import java.util.List;

public class library {
	private String LibraryName;
	private String LibraryAddress;
	private int pincode;
	
	private List<book> books;

	public String getLibraryName() {
		return LibraryName;
	}

	public void setLibraryName(String LibraryName) {
		this.LibraryName = LibraryName; 
	}

	public String getLibraryAddress() {
		return LibraryAddress;
	}

	public void setLibraryAddress(String LibraryAddress) {
		this.LibraryAddress = LibraryAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<book> getBooks() {
		return books;
	}

	public void setBooks(List<book> books) {
		this.books = books;
	}
	
}
