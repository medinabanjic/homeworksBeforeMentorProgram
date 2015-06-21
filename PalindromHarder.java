package bitcamp.ba.twentyfifth.medina;

public class PalindromHarder {

	public static void main(String[] args) {
		int n = 128521;

		int counter = 0;

		int num = 0;
		int num1 = n;

		int digit = 0;

		int counterF = 1;
		int digitF = 0;
		int a = 0;
		int b = 0;
		boolean palindrom = a == b;

		while (n != 0) {

			num = n / 10;
			n = num;
			counter++;
		}

		// Digits counter

		// Comparing the first and the last digit
		while (num1 > 0) {
			// Counter for the first digit
			while (counter >= 2) {

				counterF = counterF * 10;
				counter--;
			}

			// Removing the first digit

			digitF = num1 / counterF;
			num1 = num1 % counterF;
			a = digitF;

			counterF = counterF / 100;

			// Removing the last digit
			if (num1 != 0) {
				digit = num1 % 10;
				b = digit;
			}

			else {
				b = a;
			}

			if (num1 > 9) {
				num1 = num1 / 10;
			} else {
				num1 = 0;

			}

			System.out.println(a);
			System.out.println(b);
			System.out.println();
			if (a != b) {
				palindrom = false;
			}

		}

		if (palindrom) {
			System.out.println("The number is a palindrome.");

		} else {
			System.out.println("The number is not a palindrom.");
		}

	}
}
