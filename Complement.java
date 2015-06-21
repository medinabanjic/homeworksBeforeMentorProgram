/*1. Drugi komplement binarnih brojeva smo radili prvog dana. Vrijeme je da to ponovimo. 

Uzimajuæi èinjenicu da sada smo jako dobri u programiranju mi taj drugi komplement 

možemo napisati u JAVI. Ulaz u vaš program predstavlja String bin, kao i broj n. Taj String 

æe izgledati kao serija nula i jedinica (binarni sistem), dok broj n predstavlja na koliko je 

cifara fiksiran taj binarni broj. Uradite drugi komplement samo ako prva cifra sa lijeva je 1, 

uzimajuæi u obzir na koliko je cifara fiksiran taj binarni broj.

a. Ulaz: bin = "110", n = 4 Izlaz: "110"

b. Ulaz: bin = "1100", n = 4 Izlaz: "100"

i. Binarni broj 110 je fiksiran na 4 bita, što znaèi da je to broj 0110 i da nema 

prvu jedinicu sa lijeve strane. Zbog toga se ne radi drugi komplement.

i. Binarni broj 1100 je fiksiran na 4 bita. Prva cifra mu je 1 što znaèi da je 

negativan broj i da se treba uraditi drugi komplement. 1100 æe postati 

0011 + 1, što je 0100.

c. Ulaz: bin = "11001100", n = 8 Izlaz: "00110100"

d. Ulaz: bin = "1111111", n = 8 Izlaz: "1111111"*/

public class Complement {

	public static void main(String[] args) {
		String bin = "1110";
		int n = 4;

		// Our binary number and a number of digits

		int counterFdigit = 1;
		int digitF = 0;
		int digit = 0;
		int invertNum = 0;
		String result = "";
		int saveBin = 0;
		int counter = 1;
		int i;

		// counters for finding digits and writing an invert number, also result
		// is for converting from int to String

		int binInt = Integer.parseInt(bin);

		// converting from String to int so that we can operate on this number

		saveBin = binInt;

		for (i = 0; saveBin != 0; i++) {

			saveBin = saveBin / 10;
		}

		// we counted digits to compare them with n
		// if number has less digits than we fix then just print out number

		if (i < n) {

			System.out.println("Binary number is positive. " + bin);
		}

		// if digits and n are equal then do 2nd complement

		else {

			for (int j = 0; j < (n - 1); j++) {

				counterFdigit *= 10;

			}

			// we know how many digits we have so that we can find out wheather
			// the first digit is 1 or 0

			saveBin = binInt;

			// sometimes we need to save number so we can use it later

			digitF = saveBin / counterFdigit;

			// we get the first digit

			// if it is 1 it will find the 2nd complement
			if (digitF == 1) {

				while (binInt > 0) {

					digit = binInt % 10;
					binInt /= 10;

					// we get last digit and if it is 0 we add 1
					// if it is 1 we subtrack 1

					if (digit == 0) {
						digit += 1;
					}

					else {
						digit -= 1;
					}

					invertNum += (digit * counter);
					counter *= 10;

					// we get this bin inverted by adding digit multiplyed by
					// 10, 100, 1000...

				}

				result = Integer.toBinaryString(invertNum + 1);
				System.out.println("Binary number's 2nd Complement is: "
						+ result);

				// we convert it again to binari string, in brackets we add 1

			}

			else {

				System.out.println("Binary number is positive. " + bin);

				// if a digit is 0 we just print the number
			}

		}

	}
}
