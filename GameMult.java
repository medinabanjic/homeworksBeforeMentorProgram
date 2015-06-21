import java.util.Scanner;

public class GameMult {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int bingo = 0;

		int a = 0;

		for (int i = 0; i < 10; i++) {

			if (i > 4 && bingo == i) {

				a = (int) (Math.random() * (9 + 1) * 10);

				if (i > 8 && bingo == i) {
					a = (int) (Math.random() * 10 - 10);
				}
			}

			else {

				a = (int) (Math.random() * 9 + 1);

			}
			int b = (int) (Math.random() * 9 + 1);

			int result = a * b;

			System.out.printf("%d * %d = ", a, b);

			int num1 = in.nextInt();

			if (num1 == result) {

				bingo++;

			}

		}

		TextIO.readFile("src/Highscore");
		int highscore = TextIO.getInt();
		System.out.printf("You had %d right answers out of 10.", bingo);

		while (bingo > highscore) {

			TextIO.writeFile("src/Highscore");
			TextIO.putln(bingo);
			System.out.printf("\nThis is a new highscore. %d", bingo);
			break;

		}

		if (bingo == highscore) {
			System.out.println("You had the same score as a previous gamer.");
		}

		if (bingo < highscore) {

			System.out.println("Previous gamer was better than you.");
		}
		in.close();
	}

}
