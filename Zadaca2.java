import java.util.Arrays;
import java.util.Scanner;

public class Zadaca2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input 5 numbers: ");
		boolean Identical = true;
		int[] arr1 = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.print("Please input another 5 numbers: ");
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
			if (arr1[i] == arr2[i]) {
				Identical = true;
			} else if (arr1[i] != arr2[i]) {
				Identical = false;
			}

		}
		if (Identical) {
			System.out.println("Arrays are identical !");
		} else
			System.out.println("Arrays are NOT identical !");
	
		
		in.close();
	
	}
	
	

}