# Library-Management-System

INTRODUCTION

A Library management system that maintains library records. It can improve efficiency by reducing the time spent on administrative tasks, 

FEATURE OF LIBRARY MANAGEMENT SYSTEM
1)A Library Management System with functionalities to Add, Remove and View the Status of Books should be user friendly enough so that librarian can handles it, and can get the work done efficiently. 

2)It also helps librarian to add a new book, remove the issued book, display books details by using different classes.

WHY WE ARE CREATING THE LIBRARY MANAGEMENT SYSTEM PROJECT USING JAVA?

Java is object-oriented language that has more features in it like free access and it can run on all platforms. some of the feature that make java, a best choice for such software development are Simple language, Secure, Object-Oriented,etc.

WE USE MVC ARCHITECTURE FOR LMS:

MVC, which stands for Model-View-Controller, is a software architectural pattern commonly used in designing and developing user interfaces for web applications. It helps in organizing code in a way that separates concerns and promotes modularization, making it easier to manage and maintain large and complex codebases

Model: Represents the application's data and business logic. It is responsible for data manipulation and storage.

View: Represents the user interface. It displays the data to the user and sends user input to the controller.

Controller: Acts as an intermediary between the Model and the View. It receives user input from the View, processes it, interacts with the Model to update data, and then updates the View.
For our project, By using the concept of MVC architecture, we have Created 3 Different packages named as: a) com.qsp.lms.model
                                  b) com.qsp.lms.view
                                  c) com.qsp.lms.controller
                                  
**Source Code:**
a)com.qsp.lms.model
oIn edu.qsp.lms.model package, we have created 2 different class such as Book and Library .
oBook Class consists of Class Data Members such as bookname, AuthorName, price and publication.
oLibrary consists of Class Data Members such as libraryName, libraryAddress, pinCode and List of

**Book.java**

The provided code defines a Java class named Book, which appears to be part of a library management system and is likely used in the Model component of the MVC (Model-View-Controller) architectural pattern. In MVC, the Model represents the data and business logic of the application. Here's an explanation of the code:
Class Definition: The Book class is defined within the edu.qsp.lms.model package.

**Data Members:**

bookName: This is a private field to store the name of the book.
AutherName: This is a private field to store the name of the author.
bookprice: This is a private field to store the price of the book.

**Getter and Setter Methods:**
For each of the data members (bookName, AutherName and bookprice), there are corresponding getter and setter methods. Getter methods allow you to retrieve the values of these private fields, and setter methods allow you to set the values.

**toString Method:**
The toString method is overridden to provide a textual representation of the Book object. It returns a formatted string containing the values of the book's attributes (bookName, AutherName and bookprice).

**Library.java**
The Library class is another component in your library management system, and it is also part of the Model in the MVC (Model-View-Controller) architectural pattern. It represents the attributes and operations related to a library. Here's an explanation of the code:

Class Definition: The Library class is defined within the com.qsp.lms.model package.

**Data Members:**
libraryName: This is a private field to store the name of the library.
libraryAddress: This is a private field to store the address of the library.
pinCode: This is a private field to store the PIN code of the library.
books: This is a private field of type List<Book> to store a collection of Book objects. This represents the books available in the library.

**Getter and Setter Methods:**
For each of the data members (libraryName, libraryAddress, pinCode, and books), there are corresponding getter and setter methods. Getter methods allow you to retrieve the values of these private fields, and setter methods allow you to set the values.

**toString Method:**
The toString method is overridden to provide a textual representation of the Library object. It returns a formatted string containing the values of the library's attributes (libraryName, libraryAddress, pinCode, and books).

**b)com.qsp.lms.view**

**View.java**

The View class you've provided is a key component in the MVC (Model-View-Controller) architectural pattern. In MVC, the View is responsible for presenting the user interface and interacting with the user. It takes user input and displays information from the Model to the user. Here's an explanation of the code:

**Package Import:**
The View class imports necessary packages, including java.util.Scanner for user input and imports from the edu.qsp.lms.controller and edu.qsp.lms.model packages to use the Controller and Model components, respectively.

**Static Fields:**
The View class defines static fields to hold a Scanner, a Library object, and a Controller object. These are initialized at the class level.

**Static Block:**
There is a static block that is executed when the class is loaded. In this block, some initial setup for the library is performed, such as obtaining the library name, address, and PIN code from the user and setting them in the library object.

**Main Method:**
The main method serves as the entry point of the application.

**User Interaction Loop:**
The program enters a loop where it continuously displays a menu of options to the user and responds to their input.

**Menu Options:**


<img width="217" alt="Screenshot 2024-03-09 154925" src="https://github.com/guhagarkar/Library-Management-System/assets/161924195/41952cc9-91dc-4e9c-bf53-c1c872f0edaf">
<img width="321" alt="Screenshot 2024-03-09 155116" src="https://github.com/guhagarkar/Library-Management-System/assets/161924195/e2be6070-0d19-4400-80a0-2eff82bf8a84">
<img width="313" alt="Screenshot 2024-03-09 155152" src="https://github.com/guhagarkar/Library-Management-System/assets/161924195/5f70ff45-5ea6-409a-941b-1e6964ce5194">

**User Input and Switch Statement:**
The program reads the user's choice from the console and uses a switch statement to execute the corresponding action based on the user's choice.

**Controller Interaction:**
The View interacts with the Controller component (through the controller object) to perform actions on the Model (in this case, the Library and Book objects).
For example, when the user chooses to add a book, the View collects information about the book and calls the controller.addBook(book1) method to add it to the library.
Similarly, other actions involve interactions with the Controller to manipulate and retrieve data.

**Loop Continuation:**
The program continues to display the menu and process user input in a loop until the user chooses to exit (case 0).

**User Interaction and Output:**
The View communicates with the user by displaying menu options and providing feedback based on user input, such as confirming book additions, removals, or updates.



                                  

