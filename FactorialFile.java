package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class FactorialFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {

			long factorial = 1;
			System.out.println("Input file name: ");

			String fileName = in.nextLine();

			TextIO.readFile(fileName);

			int a = TextIO.getInt();

			for (int i = 1; i <= a; i++) {

				factorial *= i;

			}

			System.out.println("Factorial is " + factorial);
			in.close();
		} catch (IllegalArgumentException e) {
			System.out.println("Error reading from file.");

		}

	}
}
