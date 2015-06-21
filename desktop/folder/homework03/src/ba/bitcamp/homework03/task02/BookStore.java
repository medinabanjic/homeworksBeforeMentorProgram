package ba.bitcamp.homework03.task02;

import java.util.Arrays;

public class BookStore {

	private String bookStoreName;
	private Book[] books;

	public BookStore() {
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	/**
	 * Allows user to sell books When book is sold, the capacity decreases If
	 * user try to sell more books than capacity, nothing will happen
	 * 
	 * @param num
	 * @return
	 */

	public int sellBook(Book b, int num) {
		if (b.getStock() - num >= b.MIN_BOOK_CAPACITY) {
			b.setStock(b.getStock() - num);
			return b.getStock();
		} else if (b.getStock() - num < 0) {
		}
		return b.getStock();
	}

	/**
	 * Allows user to buy books User can buy only up to 3 books, because that is
	 * capacity
	 */

	public int addBook(Book b, int num) {
		if (b.getStock() + num > b.MAX_BOOK_CAPACITY) {
			return b.MAX_BOOK_CAPACITY;
		} else
			b.setStock(b.getStock() + num);

		return b.getStock();
	}

	public String getBooksByAuthor(String nameOfAuthor) {
		String s = " ";
		for (int i = 0; i < books.length; i++) {
			if (books[i].getName().equals(nameOfAuthor)) {
				s += books[i].getBookName() + "\n";
			}
		}
		return s;
	}

	public String toString() {
		String s = " ";
		s += "Name of Book Store: " + bookStoreName + "\n";
		s += Arrays.toString(books);
		return s;
	}
}
