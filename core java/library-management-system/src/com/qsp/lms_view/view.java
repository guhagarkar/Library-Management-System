package com.qsp.lms_view;


import java.util.InputMismatchException;
import java.util.Scanner;

import com.qsp.lms_controller.Controller;
import com.qsp.lms_model.book;
import com.qsp.lms_model.library;


public class view {
	private static library library = new library();
	public static library getLibrary() {
		return library;
	}

	public static void setLibrary(library library) {
		view.library = library;
	}

	static Scanner myinput = new Scanner(System.in);
	static Controller controller=  new Controller();
	static {
		System.out.println("------Welcome to LMS------");
		System.out.print("Enter name of library :- ");
		String libraryName = myinput.nextLine();
		library.setLibraryAddress(libraryName);
		System.out.print("Enter Address of library :- ");
		String libraryAddress = myinput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.print("Enter pincode of library :- ");
		library.setPincode(myinput.nextInt());
		myinput.nextLine();

	}

	public static void main(String[] args) {

		do {System.out.println("<-------------<>------------->");
			System.out.println("Select option to perform");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.print("Enter digit respective to desired option:-");
			byte choice = myinput.nextByte();
			myinput.nextLine();
			switch (choice) {
			case 0:
				myinput.close(); 
				System.out.println("------E X I T E D------");
				System.exit(0);

				break;
			case 1:
				book Book =new book();
				System.out.print("Enter book name :-");
				Book.setBookName(myinput.nextLine());
				System.out.print("Enter auther Name :-");
				Book.setBookAuther(myinput.nextLine());
				System.out.print("Enter book Price :-");
				Book.setBookPrice(myinput.nextDouble());
				myinput.nextLine();
				controller.addBook(Book);
				System.out.println("Book Added");
			
				break;
			case 2:
				
				System.out.println("Enter book name :-");
				boolean removeBook =controller.removeBook(myinput.nextLine());
				if(removeBook==true) {
					System.out.println("book was deleted");
				}else {System.out.println("book was not deleted");
					}
				
				break;
			case 3:
				System.out.println("Enter Book Name You want to Update : ");
				book bookExit = Controller.getBook(myinput.nextLine());
				if (bookExit != null) {
					book bookToUpdate = bookExit;
					System.out.println("What to Update ?");
					System.out.println("1.Book Name\n2.Auther Name\n3. Book Price");
					System.out.print("Enter Digit Respective to Desired Option : ");
					byte updateChoice = myinput.nextByte();
					myinput.nextLine();

					switch (updateChoice) {
					case 1:
						System.out.print("Enter Updated Book Name : ");
						bookToUpdate.setBookName(myinput.nextLine());

						break;
					case 2:
						System.out.print("Enter Updated Auther Name : ");
						bookToUpdate.setBookAuther(myinput.nextLine());

						break;
					case 3:
						try {
							System.out.print("Enter Updated Price : ");
							bookToUpdate.setBookPrice(myinput.nextDouble());
							myinput.nextLine();
						} catch (InputMismatchException e) {
							System.out.println("Enter a Valid Price ");
						}

						break;

					default:
						System.out.println("-----Invalid Selection-----");
						break;
					}
					if (Controller.updateBook(bookExit, bookToUpdate)) {
						System.out.println("Book Updated");
					} else {
						System.out.println("Book Not Updated");
					}

				} else {
					System.out.println("Book not Found , Updation can't be Perform");
				}

				break;
			case 4:
				System.out.print("Enter book name you are looking for :-");
				book fetchBook=controller.getBook(myinput.nextLine());
				if(fetchBook!= null) {
					System.out.println("book is avaliable");
					System.out.println("details:-");
					System.out.println(fetchBook);
					
				}else {
					System.out.println("book not avalible");
				}
				break;

			default:
				System.out.println("sahi number daal yarr!! ");
				break;
			}
		} while (true);

	}

}
