package ba.bitcamp.homework03.task02;

public class Book extends Author {

	public static final int MAX_BOOK_CAPACITY = 3;
	public static final int MIN_BOOK_CAPACITY = 0;

	/**
	 * Properties of book
	 */
	private String name;
	private int price;
	private int stock;

	/**
	 * Creating constructor with information of author from class Author
	 * 
	 * @param name
	 * @param mail
	 * @param gender
	 * @param book
	 *            Name of book
	 * @param price
	 *            Book price
	 * @param stock
	 *            How many books are in stock
	 */
	public Book(String name, String mail, boolean gender, String book,
			int price, int stock) {
		super(name, mail, gender);
		this.name = book;
		this.price = price;
		this.stock = stock;
	}

	/**
	 * Returns book name
	 * 
	 * @return
	 */
	public String getBookName() {
		return name;
	}

	/**
	 * Gives user opportunity to set Book name
	 * 
	 * @param bookName
	 */
	public void setBookName(String bookName) {
		this.name = bookName;
	}

	/**
	 * Returns book price
	 * 
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Gives user opportunity to set price of a book
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Returns how many books are in stock (max 3)
	 * 
	 * @return
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Gives user opportunity to set how many books are in stock, but if he
	 * enters more books than the capacity is, then capacity is set to maximum
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
		if (stock > MAX_BOOK_CAPACITY) {
			stock = MAX_BOOK_CAPACITY;
		} else if (stock < MIN_BOOK_CAPACITY) {
			stock = MIN_BOOK_CAPACITY;
		}
	}

	/**
	 * Printing information about book
	 */
	public String toString() {
		String s = super.toString() + "\n";
		s += "Book name : " + name + "\n";
		s += "Book price: " + price + "\n";

		if (stock > MIN_BOOK_CAPACITY && stock <= MAX_BOOK_CAPACITY) {

			s += "Stock: " + stock + "\n";
		} else {
			System.out.println("We do not have this book in our stock.\n");
		}

		return s;
	}
}
