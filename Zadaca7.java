import java.util.Arrays;
import java.util.Scanner;


public class Zadaca7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[]arr= new int [100000];
		for (int i = 0; i < arr.length ; i++) {
			arr[i]= (int)(Math.random()*99999 +1);
		}
		Arrays.sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("Please enter number to check: ");
		int N = in.nextInt();
		
		if (Arrays.binarySearch(arr, N) >= 0 ){
		System.out.println("It is on a " + Arrays.binarySearch(arr, N) + " place.");
		
		}
		
		else {
			System.out.println("There is no such a number in array.");
		}
		
		
		long a = System.currentTimeMillis();
		
		System.out.println("It needs " + a + " milliseconds to compile.");
		in.close();
	}
}
