package ba.bitcamp.medina.banjic;

public class Triangle {

	public static void main(String[] args) {
		
		int sideA= 23;
		int sideB= 12;
		int sideC= 25;
		
		// I declared three integers for a triangle sides
		
		if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)){
			
			System.out.println("These sides construct a triangle.");
		}
		
		else 
			
			System.out.println("These sides do not construct a triangle.");

		
		// I made an IF statement which has three condition with AND logical operator 
		// IF the sum of any two sides of these three integers is greater than the third
		// it will write out that it is a triangle, if the condition is false, it will write out
		// that it is not a triangle
	}

}
