package ba.bitcamp.medina.banjic;

public class Equation {

	public static void main(String[] args) {

		int a = 2;
		int b = 1;
		int c = 4;
		int d = 1;

		// I declared 5 variables where x is a potential solution

		int x = 2;

		int result = a * x * x * x + b * x * x + c * x + d;

		if (result == 0) {

			System.out.printf(
					"Potential solution of the cubic equation is x= %d.", x);
		} else {
			System.out
					.printf("Number x= %d is not a potential solution of the cubic equation.",
							x);
		}
	}
}
