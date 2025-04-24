package com.training.model;

public class Book {
	private String bookName;
	private String authorName;
	private int noOfPages;
	private boolean issueStatus;

	public Book(String bookName, String authorName, int noOfPages, boolean issueStatus) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
		this.issueStatus = issueStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		return true;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public boolean isIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(boolean issueStatus) {
		this.issueStatus = issueStatus;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", noOfPages=" + noOfPages
				+ ", issueStatus=" + issueStatus + "]";
	}

}
