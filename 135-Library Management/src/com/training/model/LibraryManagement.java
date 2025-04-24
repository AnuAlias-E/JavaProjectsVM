package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class LibraryManagement {
	List<Book> allBooks;

	public LibraryManagement() {
		super();
		this.allBooks = new LinkedList<>();
		Book book1 = new Book("Harry Potter", "J.K Rowling", 600, false);
		Book book2 = new Book("Tom Gates", "Liz Pichon", 1000, false);
		Book book3 = new Book("Blue Umbrella", "Ruskin Bond", 100, false);
		Book book4 = new Book("Secret Seven", "Enid Blyton", 450, false);
		Book book5 = new Book("The Jungle Book", "Rudyard Kipling", 300, false);
		Book book6 = new Book("Charlottes web", "E.B White", 650, false);
		Book book7 = new Book("Matilda", "Roald Dahl", 558, false);
		Book book8 = new Book("Winnie the pooh", "A.A. Milne", 800, false);
		Book book9 = new Book("The Tale of Perter Rabbit", "Beatrix Potter", 760, false);
		Book book10 = new Book("The Little Prince", "Antoine ", 800, false);

		this.allBooks.add(book1);
		this.allBooks.add(book2);
		this.allBooks.add(book3);
		this.allBooks.add(book4);
		this.allBooks.add(book5);
		this.allBooks.add(book6);
		this.allBooks.add(book7);
		this.allBooks.add(book8);
		this.allBooks.add(book9);
		this.allBooks.add(book10);
	}

//find the book which is issued and change the status to true
	public void issueBook(String bookName) {
		for (Book book : this.allBooks) {
			if (book.getBookName().equalsIgnoreCase(bookName)) {
				book.setIssueStatus(true);
			}
		}
	}

	// print all the books whose issue status false
	public void printAvailableBook() {
		System.out.println("The Available Books Listed Below!!!");
		for (Book book : this.allBooks) {
			if (!book.isIssueStatus())
				System.out.println(book);
		}
	}

	// find the count of the available books in the library
	public int getAvailableBooksCount() {
		long count = this.allBooks.stream().filter(c -> !c.isIssueStatus()).count();
		return (int) count;

	}
	// find the count of the issued books in the library
	public int getIssuedBooksCount() {
		long count = this.allBooks.stream().filter(c -> c.isIssueStatus()).count();
		return (int) count;
	}
}
