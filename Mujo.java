public class Mujo {

	public static void main(String[] args) {
		int N = 14;
		int n = 0;
		int result = 4 - n;

		n = N % 4;

		if (n != 0) {

			result = 4 - n;

			if (result > 1) {
				System.out.printf("Mujo mora kupiti %d kontejnera.", result);
			} else {
				System.out.printf("Mujo mora kupiti %d kontejner.", result);
			}

		} else {

			System.out
					.println("Dobro je prosao danas, ne treba kupiti nijedan.");
		}

	}
}
