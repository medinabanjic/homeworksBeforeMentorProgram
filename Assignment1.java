package bitcamp.ba.homework.medina;

public class Assignment1 {

	public static void main(String[] args) {
		int n = 4;
		int counter = 0;

		// I declared a variable for a division and a counter to count how
		// many times while loop started

		// while the number is bigger than 0 it will be divided by 2
		while (n != 0) {

			n = n / 2;
			counter++;
		}

		System.out.println("Number can be divided: " + counter + " times");

	}

}
