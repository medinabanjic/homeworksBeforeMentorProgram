package bitcamp.ba.homework.medina;

public class Assignment3 {

	public static void main(String[] args) {

		int n = 12;
		int counter = 1;
		int sum = 0;

		while (counter < n) {
			if (n % counter == 0) {
				sum = sum + counter;
			}
			counter++;
		}

		if (sum == n) {

			System.out.printf("The number %d is perfect.", n);
		} else {
			System.out.printf("The number %d is not perfect.", n);
		}

	}

}
