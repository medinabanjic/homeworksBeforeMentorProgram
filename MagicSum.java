package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");

		int n = in.nextInt();

		System.out.println("Perfect numbers lower than input are: ");

		for (int i = 2; i < n; i++) {
			int num = i;
			int sumD = 0;
			int j = 1;

			while (j < num) {

				if (num % j == 0) {

					sumD += j;
				}
				j++;

			}

			if (sumD == num) {
				System.out.println(num + " ");
			}

		}

		in.close();

	}

}
