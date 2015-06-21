/*2. U JAVI je poznato da svaka otvorena zagrada treba imati svoju zatvorenu zagradu. Vaš 

zadatak je da provjerite da li su sve zagrade zatvorene kako treba. Jedna otvorena zagrada 

odgovara taèno jednoj zatvorenoj zagradi. Pored toga, zagrada se ne može zatvoriti ako 

nema nijedne koju æe zapravo zatvoriti. Sa konzole primate jedan String koji predstavlja 

seriju zagrada. Odrediti da li su sve zagrade otvorene i zatvorene kako treba. Ukoliko jest, 

ispisati true, u suprotnom false. Hint: Koristite charAt(int) metodu.

a. Ulaz: {{{}}} Izlaz: true

b. Ulaz: {{{}{{}}}} Izlaz: true

c. Ulaz: {{} Izlaz: false Objašnjenje: Jedna zagrada nije zatvorena

d. Ulaz: }{}} Izlaz: false Objašnjenje: Zagrada pogrešno otvorena*/

public class Bracket {

	public static void main(String[] args) {

		String brackets = ("{{{}}");

		int lengthString = brackets.length();

		int counterF = 0;
		int counterS = 0;

		// we have string with brackets, length of that string,
		// and counters for brackets, later on more about it :)

		for (int i = 0; i < lengthString; i++) {
			char bracketCheck = brackets.charAt(i);
			char brac = '{';
			char ket = '}';

			// this loop will go through our string and split it to parts, find
			// brac and ket (bracket)
			if (bracketCheck == brac) {
				counterF++;

				// when it finds brac first counter will be increased for 1
			} else if (bracketCheck == ket) {
				counterS++;

				// when it finds ket second counter will be increased for 1
			}
		}

		// now that we have number of brac and ket we have to compare them
		// if number of brac is equal to number of ket everything is fine
		// because they cannot exist without each other
		if (counterF == counterS) {
			System.out.println("Brackets are closed.");

			// else if not, well we have to add one of these, and it will print how many and which one
		} else {
			System.out.println(" Brackets are not closed.");
			if (counterF < counterS) {
				System.out.println(" You have to add " + (counterS - counterF)
						+ " {.");
			} else {
				System.out.println(" You have to add " + (counterF - counterS)
						+ " }.");
			}

		}

	}

}
