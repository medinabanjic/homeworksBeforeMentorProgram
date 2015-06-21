package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = in.nextInt();

		int digit = 0;
		int invertNum = 0;

		for (int i = 1; n > 0; i *= 10) {

			digit = n % 10;
			n = n / 10;

			if (digit != 0) {

				invertNum += (digit * i);
			} else {
				i /= 10;
			}

		}

		System.out.println(invertNum);
		in.close();

	}

}
