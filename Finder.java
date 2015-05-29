package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class Finder {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		System.out.println("Input digit number: ");
		int num = in.nextInt();

		int digit = 0;
		int counter = 0;

		while (n > 0) {

			digit = n % 10;
			n = n / 10;
			counter++;

			if (counter == num) {
				System.out.print(digit);
			}

		}

		in.close();

	}

}
