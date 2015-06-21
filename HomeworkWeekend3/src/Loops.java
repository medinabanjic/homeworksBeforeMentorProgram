import java.util.Scanner;

public class Loops {

	// A method for counting three digits from right to left
	// it puts "," between every group of three
	public static void threeDigits(int n) {
		String message = Integer.toString(n);
		String message2 = "";

		int counter = 0;
		int length = message.length();

		if (length > 3) {

			// if the length of string which is our number is bigger than 3
			// it will find every character and increase a counter every time
			// when counter reaches a number which can be divided by three it
			// will put ","

			for (int i = length - 1; i >= 0; i--) {

				char digits = message.charAt(i);
				message2 = Character.toString(digits) + message2;
				counter++;

				if (counter % 3 == 0 && i > 0) {

					message2 = "," + message2;

				}
			}

			System.out.println(message2);
		}

		else {

			System.out.println(message);
		}

	}

	// A method which counts the length of our number
	// converted to string, I just used string.length();

	public static void length(int n) {

		String nToString = Integer.toString(n);

		int length = nToString.length();

		if (length > 1) {
			System.out.printf("Number %d has %d digits.\n", n, length);
		} else {

			System.out.printf("Number %d has %d digit.\n", n, length);

		}
	}

	// a method which swipe first and last digit of our number
	// I have used substring to find characters as I knew that I needed value on
	// first and last index
	// returned N which was previously converted to int

	public static int invertDigit(int n) {

		String number = Integer.toString(n);
		String firstDigit = number.substring(0, 1);
		String lastDigit = number.substring(number.length() - 1);
		String midd = number.substring(1, number.length() - 1);
		String newN = lastDigit + midd + firstDigit;
		int N = Integer.parseInt(newN);
		return N;
	}

	// this method finds a difference between number n and q
	// if the n is lower counter will go from n to q and reverse
	// if the counter is even it will print out all even numbers from n to q or
	// reverse
	// if odd it will print all odds in that range
	// if it is maybe a palindrome it will print it out.

	public static void counter(int n, int q) {

		int counter = 0;

		if (n < q) {
			for (int i = n; i <= q; i++) {
				counter++;

			}
			if (counter % 2 == 0) {
				for (int i = n; i <= q; i++) {

					if (i % 2 == 0) {
						System.out.print(i + " ");
					}

				}
			}

			else if (counter % 2 != 0) {
				for (int i = n; i <= q; i++) {

					if (i % 2 != 0) {
						System.out.print(i + " ");
					}

				}

			}
		}

		else if (q < n) {
			for (int i = q; i <= n; i++) {
				counter++;
			}

			if (counter % 2 == 0) {

				for (int i = q; i <= n; i++) {
					if (i % 2 == 0) {

						System.out.print(i + " ");
					}

				}
			}

			else if (counter % 2 != 0) {
				for (int i = q; i <= n; i++) {

					if (i % 2 != 0) {
						System.out.print(i + " ");
					}

				}

			}

		}

		else {
			System.out.println("These two numbers are the same. Probably a palindrome.");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input number N: ");
		int N = in.nextInt();

		// length(N);
		// threeDigits(N);

		counter(N, invertDigit(N));
		in.close();

	}
}
