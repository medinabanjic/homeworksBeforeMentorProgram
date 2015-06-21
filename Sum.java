package ba.bitcamp.medina.banjic;

public class Sum {

	public static void main(String[] args) {

		int num = 1815;
		int result = 0;

		// I declared variable for a given number
		// I declared 3 variables for separating num to 10^0 + 10^1 + 10^2 + 10^3
		int a = 0;
		int b = 0;
		int c = 0;

		a = num / 1000;
		num -= (a * 1000);

		b = num / 100;
		num -= (b * 100);

		c = num / 10;
		num -= (c * 10);

		result = a + b + c + num;

		System.out.println("The sum is: " + result);

	}

}
