package chapter01.section03.inheritanceORdelegation1;

import java.util.Vector;

class Book {
	private String title;
	private String author;
	private String isbnNumber;
	private int price;
	private String category;
	
	public Book(String title, String author, String isbnNumber, int price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
		this.price = price;
		this.category = category;
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbnNumber=" + isbnNumber + ", price=" + price
				+ ", category=" + category + "]";
	}
}

class BookShelf {
	private Vector<Book> bookShelf;
	
	public BookShelf() {
		bookShelf = new Vector<Book>();
	}

	public void addBook(Book book) {
		bookShelf.add(book);
	}
	
	public Book getBook(int index) {
		return bookShelf.get(index);
	}
	
	public void removeBook(Book book) {
		bookShelf.remove(book);
	}
}


public class InheritanceToDelegation2 {
	public static void main(String[] args) {
		Book book1 = new Book("JAVA ����", "hong", "ISBN-978-89-954321-0-5", 24000, "Computer");
		Book book2 = new Book("SQL �ǹ�", "kim", "ISBN-973-89-953321-1-6", 18000, "Computer");
		
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(book1);
		bookShelf.addBook(book2);
		
		Book book = bookShelf.getBook(0);
		System.out.println(book.toString());
	}
}


























