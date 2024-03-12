package com.qsp.lms_model;

public class book {
	private String BookName;
	private String BookAuther;
	private double BookPrice;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuther() {
		return BookAuther;
	}
	public void setBookAuther(String bookAuther) {
		BookAuther = bookAuther;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return " BookName = " + BookName + "\n BookAuther = " + BookAuther + "\n BookPrice = " + BookPrice + "]";
	}
	
	

}
