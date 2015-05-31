public class Methods {

	public static int getNextOddNumber(int num) {
		if (num % 2 == 0) {
			num = num + 1;
		} else
			num = num + 2;
		return num;

	}

	// this method will return next odd number, we just check if it is already
	// odd or even and add 2 or 1

	public static double getAreaOfCircle(int diameter) {
		double area = (diameter / 2) * (diameter / 2) * Math.PI;
		return area;

	}

	// we just implement the equation for area of circle and return area

	public static boolean isInRange(int first, int last, int n) {
		boolean numIsInRange = true;
		if (first < n && n < last) {
			numIsInRange = true;
		} else
			numIsInRange = false;
		return numIsInRange;
	}

	// returns boolean if the number is in the given range or not

	public static void main(String[] args) {
		System.out.print("Next odd number is : ");
		System.out.println(getNextOddNumber(12));

		System.out.print("Area of circle is : ");
		System.out.println(getAreaOfCircle(3));

		System.out.print("Number is in range : ");
		System.out.println(isInRange(145, 987, 343));
	}

	// we test our methods in main method..

}
