import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input numbers: ");
		int num1 = in.nextInt();

		int num2 = in.nextInt();

		TextIO.writeUserSelectedFile();

		for (int i = -1; i <= num1; i++) {

			for (int j = -1; j <= num2; j++) {

				if (i == -1 && j == -1) {
					TextIO.putf("*");
				}

				else if (i == -1 && j == 0) {
					TextIO.putf(" |");
				} else if (i == -1 && j > 0) {
					TextIO.putf("%3d", j);
				}

				else if (j == 0 && i == 0) {
					TextIO.putf("  ");
				}

				else if (i == 0 && j == -1) {
					TextIO.putf("-");
				}

				else if (i > 0 && j == -1) {
					TextIO.putf("%-2d", i);

				}

				else if (i == 0 && j > 0) {
					TextIO.putf("  -");
				}

				else if (i > 0 && j == 0) {
					TextIO.putf("| ");
				}

				else if (i > 0 && j > 0) {
					TextIO.putf("%2d ", i * j);

				}

			}
			TextIO.putln();
		}

		in.close();

	}

}
