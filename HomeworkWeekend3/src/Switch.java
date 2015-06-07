import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input hours in 24-hour format: ");
		int h = in.nextInt();
		
		// this switch will help us find out what is a time for
		// I did not understand should I use a fall through, which would exclude break; 
		// that way we will not have the right output
		// so I used them
		
		switch (h){
		
		case 9: case 10: case 11: case 12: case 13:
			System.out.println("It is a class time.");
			break;
			
		case 14: case 15: case 16: case 17:
			System.out.println("It is a time for exercises.");
			break;
			
		case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 1:
			System.out.println("It is a homework time.");
			break;
			 
		case 2: case 3: case 4: case 5: case 6: case 7: case 8:
			System.out.println("Finally, a sleeping time.");
			break;
			
		default:
			System.out.println("");
		}
		
		in.close();


	}

}
