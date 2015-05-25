package ba.bitcamp.medina.banjic;

public class Comparison {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 21;
		int num3 = 3;
		int num4 = -2;

		// I declared 4 variables so that I can compare them
		
		// IF statements below are comparing all numbers with each other and printing out the lowest

		if (num1 < num2 && num1 < num3 && num1 < num4) {

			System.out.println(num1 + " ");

			if (num2 < num3 && num2 < num4) {

				System.out.println(num2 + " ");

				if (num3 < num4) {

					System.out.println(num3 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num3);
			}

			else if (num3 < num2 && num3 < num4) {

				System.out.println(num3 + " ");
				
				if (num2 < num4) {

					System.out.println(num2 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num2);
			}

			else {

				System.out.println(num4 + " ");
				
				if (num3 < num2) {

					System.out.println(num3 + "\n" + num2);
				}
				
				else 
					
					System.out.println(num2 + "\n" + num3);
			}
		}

		if (num2 < num1 && num2 < num3 && num2 < num4) {

			System.out.println(num2 + " ");

			if (num1 < num3 && num1 < num4) {

				System.out.println(num1 + " ");

				if (num3 < num4) {

					System.out.println(num3 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num3);
			}

			else if (num3 < num1 && num3 < num4) {

				System.out.println(num3 + " ");
				
				if (num1 < num4) {

					System.out.println(num1 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num1);
			}

			else {

				System.out.println(num4 + " ");
				
				if (num3 < num1) {

					System.out.println(num3 + "\n" + num1);
				}
				
				else 
					
					System.out.println(num1 + "\n" + num3);
			}
		}

		if (num3 < num2 && num3 < num1 && num3 < num4) {

			System.out.println(num3 + " ");

			if (num1 < num2 && num1 < num4) {

				System.out.println(num1 + " ");
				
				if (num2 < num4) {

					System.out.println(num2 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num2);
			}

			else if (num2 < num1 && num2 < num4) {

				System.out.println(num2 + " ");
				
				if (num1 < num4) {

					System.out.println(num1 + "\n" + num4);
				}
				
				else 
					
					System.out.println(num4 + "\n" + num1);
			}

			else {

				System.out.println(num4 + " ");
				
				if (num1 < num2) {

					System.out.println(num1 + "\n" + num2);
				}
				
				else 
					
					System.out.println(num2 + "\n" + num1);
			}
		}

		if (num4 < num2 && num4 < num3 && num4 < num1) {

			System.out.println(num4 + " ");

			if (num2 < num3 && num2 < num1) {

				System.out.println(num2 + " ");
				
				if (num3 < num1) {

					System.out.println(num3 + "\n" + num1);
				}
				
				else 
					
					System.out.println(num1 + "\n" + num3);
			}

			else if (num3 < num2 && num3 < num1) {

				System.out.println(num3 + " ");
				
				if (num2 < num1) {

					System.out.println(num2 + "\n" + num1);
				}
				
				else 
					
					System.out.println(num1 + "\n" + num2);
			}

			else {

				System.out.println(num1 + " ");
				
				if (num3 < num2) {

					System.out.println(num3 + "\n" + num2);
				}
				
				else 
					
					System.out.println(num2 + "\n" + num3);
			}
		}
	}
}
