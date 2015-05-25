package ba.bitcamp.medina.banjic;

public class Division {

	public static void main(String[] args) {
		int num = 500;
		int result = 0;

		// I declared variable for a given number
		// I declared 2 variables for separating num to 10^0 + 10^1 + 10^2 
		int a = 0;
		int b = 0;
		

		a = num / 100;
		num -= (a * 100);

		b = num / 10;
		num -= (b * 10);

		result = a + b + num;
		
		num= (b * 10) + (a * 100) + num;
		
		if((num % result) == 0){
			
			System.out.println("The number can be divided by the sum of its digits.");
		}

		else 
			
			System.out.println("The number cannot be divided by the sum of its digits.");


	}

}
