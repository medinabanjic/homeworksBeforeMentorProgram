package bitcamp.ba.homework.medina;

public class Assignment2 {

	public static void main(String[] args) {
		int n = 10;
		int counter = 1;
		int sum = 0;
		
		// I declared number for division, counter and sum
		
		// this loop will find even numbers, sum them up and then we will print them
		while (counter < n) {

			if (counter % 2 == 0) {

				sum = sum + counter;
			}

			counter++;

		}
		System.out.println("The sum of even numbers from 1 to n is " + sum);
	}

}
