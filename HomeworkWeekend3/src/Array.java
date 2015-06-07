import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static int[] threeArrays(int[] a1, int[] a2) {

		int length = a1.length + a2.length;
		int[] array3 = new int[length];

		for (int i = 0; i < a1.length; i++) {

			array3[i] = a1[i];

		}

		for (int i = a1.length; i < length; i++) {

			array3[i] = a2[i - a1.length];

		}

		for (int value : array3) {
			System.out.print(value + " ");
		}

		return array3;
	}

	public static int[] sumOfArrays(int[] a1, int[] a2) {

		int lengthMin = 0;
		int lengthMax = 0;
		boolean isLeft = true;

		if (a1.length < a2.length) {

			lengthMin = a1.length;
			lengthMax = a2.length;
			isLeft = true;

		} else {
			lengthMin = a2.length;
			lengthMax = a1.length;
			isLeft = false;
		}

		int[] array3 = new int[lengthMax];
		for (int i = 0; i < lengthMin; i++) {

			array3[i] = a1[i] + a2[i];

		}
		for (int j = lengthMin; j < lengthMax; j++) {

			if (isLeft == true) {

				array3[j] = a2[j];

			}

			else {
				array3[j] = a1[j];

			}
		}

		return array3;

	}

	public static boolean areSame(int[] a1, int[] a2) {

		boolean areEqual = Arrays.equals(a1, a2);

		return areEqual;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the length of array N: ");

		int lengthN = in.nextInt();

		System.out.println("Input the length of array M: ");

		int lengthM = in.nextInt();

		int[] array = new int[lengthN];
		int[] array2 = new int[lengthM];

		System.out.println("Please input values of array N: ");
		for (int i = 0; i < lengthN; i++) {

			int value = in.nextInt();
			array[i] = value;

		}

		System.out.println("Please input values of array M: ");
		for (int i = 0; i < lengthM; i++) {

			int value = in.nextInt();
			array2[i] = value;

		}

		// System.out.println(areSame(array, array2));
		// System.out.println(Arrays.toString(sumOfArrays(array, array2)));
		System.out.println(Arrays.toString(threeArrays(array, array2)));
		in.close();
	}
}
