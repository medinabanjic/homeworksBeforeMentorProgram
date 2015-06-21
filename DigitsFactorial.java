import java.util.Scanner;

/*3. Korisnik unosi vrijednost broja n na konzoli. Na konzolu ispisati zadnje dvije cifre (ne 

 ukljuèujuæi nule) u proraèunu n!.

 a. Ulaz: 5 Izlaz: 12 Objašnjenje: 5! = 120

 b. Ulaz: 10 Izlaz: 88 Objašnjenje: 10! = 3628800

 c. Ulaz: 20 Izlaz: 64

 d. Ulaz: 1000 Izlaz: 72*/

public class DigitsFactorial {

	public static void main(String[] args) {

		int factorial = 1;
		int digit = 0;
		int digitCounter = 0;
		int invertNum = 0;
		int counter = 1;

		// we have counters, invert number, digit variables
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		// we are asking for user's input

		for (int i = 1; i <= n; i++) {

			factorial *= i;
		}

		// we count factorial

		while (digitCounter < 2 && factorial > 0) {

			digit = factorial % 10;
			factorial /= 10;

			// we find the last digit
			// if it is not zero we add it to invert number and multiply by 10,
			// 100 ....
			// we do this while factorial is greater than 0 and our last digits
			// are found

			if (digit != 0) {

				invertNum += (digit * counter);
				counter *= 10;
				digitCounter++;

				// when we find one digit counter will be increased by 1
			}
		}

		System.out.println("The result is: " + invertNum);

		// we print the result

		in.close();

	}

}
