package bitcamp.ba.twentyfifth.medina;

import java.util.Scanner;

public class DivisionSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1 = -1;
		int sumE = 0;

		while (num1 != 0) {
			System.out.println("Input number: ");
			num1 = in.nextInt();

			for (int i = 1; i <= num1; i++) {
				if (num1 % i == 0) {
					sumE += i;
				}
				
			}
			if (num1 != 0){
			System.out.println("Sum is: " + sumE);
		} }

		

		in.close();

	}

}
