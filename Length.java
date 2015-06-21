package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		int num = 0;
		int i = 0;

		for (i = 0; n != 0; i++) {

			num = n / 10;
			n = num;
		}

		System.out.println(i);

		in.close();

	}

}
