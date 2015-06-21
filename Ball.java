package ba.bitcamp.medina.banjic;

public class Ball {

	public static void main(String[] args) {

		// I declared a radius variable which for this assignment has to be 1.12799
		// That is the only way to have a good quality ball..

		double r = 1.12799;

		double ballVolume = 0;

		ballVolume = (((4 * Math.PI) / 3) * (r * r * r));

		if (ballVolume <= 6.017007 && ballVolume > 6.014) {

			System.out.printf("Ball Volume is %f. It is a good quality ball.",
					ballVolume);
		}

		else if (ballVolume >= 6.010993 && ballVolume < 6.014) {

			System.out.printf("Ball Volume is %f. It is a good quality ball.",
					ballVolume);

		}

		else

			System.out.printf("Ball Volume is %f. It is a bad quality ball.",
					ballVolume);

	}

}
