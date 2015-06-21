package ba.bitcamp.homework03.task02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("Haso", "haso@bitcmap.ba", true,
				"Bit Camp", 51, 1);
		Book b2 = new Book("fata", "fata@bitcmap.ba", true,
				"Bit Camp2", 34, 2);
		Book b3 = new Book("fata", "mujo@bitcmap.ba", true,
				"Bit Camp3", 57, 3);

		System.out.println(b1);

		Book[] array = new Book[3];
		array[0] = b1;
		array[1] = b2;
		array[2] = b3;
		System.out.println(Arrays.toString(array));

		BookStore bs = new BookStore();
		bs.setBookStoreName("NMB");
		bs.setBooks(array);
		bs.sellBook(b2, 2);
		bs.addBook(b3, 2);

		System.out.println(bs);

	}
}
