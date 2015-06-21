import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the number of a desired day of a week: ");

		int n1 = in.nextInt();

		switch (n1) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Working day.");
			break;

		case 6:
		case 7:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("You have to input a number in range 1-7");

		}

		in.close();

	}

}
