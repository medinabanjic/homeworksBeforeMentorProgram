package ba.bitcamp.medina.banjic;

public class FizzBuzz {

	public static void main(String[] args) {

		int num = 15;

		// I declared a number for a division

		// IF statements below are comparing the modul of a num 3 or 5 with 0

		if (num % 3 == 0) {

			if (num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else

				System.out.println("Fizz");

		}

		else if (num % 5 == 0) {

			if (num % 3 == 0) {
				System.out.println("FizzBuzz");
			} else

				System.out.println("Buzz");
		}

		else

			System.out.println(num);

	}

}
