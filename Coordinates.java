package ba.bitcamp.medina.banjic;

public class Coordinates {

	public static void main(String[] args) {

		int Ax = 3;
		int Ay = 3;
		int Az = 4;
		
		// I declared three variables for a coordinates x, y, z for a point A
		// As we are calculating distance from the initial points 0, 0, 0 we do not have to 
		// include them in a formula below
		// I used sqrt for a square root of the sum of squares
		
		double distance = Math.sqrt(Ax * Ax + Ay * Ay + Az * Az);
		
		System.out.println("Distance is: " + distance);

	}
		
	}


