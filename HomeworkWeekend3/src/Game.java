import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static int[] randomArray() {
		int[] five = new int[5];

		for (int i = 0; i < 5; i++) {

			five[i] = (int) (Math.random() * 5);

		}

		return five;
	}

	public static boolean allNull(int[] a1) {

		boolean allNull = true;

		for (int i = 0; i < 5; i++) {

			if (a1[i] != 0) {

				allNull = false;
				break;
			}

		}

		return allNull;
	}

	public static int[] game(int[] a1, int n) {
		int x = 1;

		while (x > 0) {
			try {

				if (n % 2 == 0) {

					for (int i = 0; i < 5; i++) {

						a1[i] += n;

						if (a1[i] > 4) {

							a1[i] = 4;
						}

					}
					a1[n] -= n - 1;
				}

				else if (n % 2 != 0) {

					for (int i = 0; i < 5; i++) {

						a1[i] -= n;

						if (a1[i] < 0) {

							a1[i] = 0;
						}

					}
					a1[n] += n - 1;

				}

				else if (n == 0) {

					a1[n] -= 1;
				}

			} catch (Exception e) {
				System.out.println("Please input number between 0 and 4: ");
				Scanner in = new Scanner(System.in);
				n = in.nextInt();
				x++;
				in.close();
			}

		}

		return a1;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] array = randomArray();
		System.out.println(Arrays.toString(array));
		long startTimeInMillis = System.currentTimeMillis();
		while (allNull(array) != true) {

			System.out.println("Input the index: ");
			int n = in.nextInt();
			game(array, n);
			System.out.println(Arrays.toString(array));
			allNull(array);

		}
		in.close();

		long finishTimeInMillis = System.currentTimeMillis();

		int h = (int) (((startTimeInMillis - finishTimeInMillis) / 1000) / 3600) % 60;
		int m = (int) (((startTimeInMillis - finishTimeInMillis) / 1000) / 60) % 60;
		int s = (int) (((startTimeInMillis - finishTimeInMillis) / 1000) % 60);

		System.out
				.printf("You needed %d hours %d minutes %d seconds to finish the game.",
						h, m, s);

	}

}
