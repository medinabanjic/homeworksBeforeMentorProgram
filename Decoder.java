/*4. Zadatak vam je dekodirati (dešifrovati) dati file encodedFile.in koji sam vam dao. Prva linija 

file-a sadrži broj n. Broj n oznaèava koliko æe se linija pojaviti poslije tog broja. Šifrovan je 

tako što je svaki karakter (èak i razmak) promijenjen za jedan više prema ASCII tabeli 

karaktera. Tako je slovo 'K' postalo slovo 'L', jer se 'L' nalazi za jedno mjesto više u odnosu 

na 'K'. Reèenica „Hello World.“ je postala tako „Ifmmp!Xpsme/“. Prema ASCII tabeli razmak 

bi se zamijenio sa '!' jer dolazi odmah poslije.

Hint 1: Èitajte liniju po liniju iz file-a i koristite charAt(int) metodu sa kojom možete uzimati 

slovo po slovo. Hint 2: Koristite casting da pretvarate iz int u char i obratno, jer trebate

karakter pretvoriti u broj, pa onda ga „poveæati“ za 1 i ponovo pretvoriti u karakter.*/

public class Decoder {

	public static void main(String[] args) {

		TextIO.writeFile("src/Decoder");
		TextIO.readFile("src/encodedFile.in");
		// methods from the class TextIO for reading and writing to file

		int n = TextIO.getlnInt();

		// we find out how many lines are after the number of lines

		for (int i = 2; i <= n; i++) {
			String reader = TextIO.getlnString();

			// we read line by line from file

			int length = reader.length();

			// we calculate length of it

			for (int j = 0; j < length; j++) {

				int letterCheck = reader.charAt(j);

				// we read character by character from a line and we already
				// casted it to int

				int charToInt = letterCheck - 1;

				// we subtract 1

				char letter = (char) charToInt;

				// now we convert it to characters

				TextIO.put(letter);

				// we put them to new file

				if (j == length - 1) {
					TextIO.putln();

					// this will make a new line everytime we get to the end of
					// sentence or encoded line
				}

			}

		}

	}

}
