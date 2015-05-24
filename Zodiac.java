package ba.bitcamp.medina.banjic;

public class Zodiac {

	public static void main(String[] args) {

		int day = 23;
		int month = 7;

		// I declared variables for date of birth
		// IF statements below have same functions only the range is different,
		// if you input date it will calculate your zodiac sign
		
		if (((day <= 20 && month == 4) || (day >= 21 && month == 3))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Aries");
			}
		}
		
		if (((day <= 20 && month == 5) || (day >= 21 && month == 4))) {

			if (day > 30) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Taurus");
			}
		}
		
		else if (((day <= 20 && month == 6) || (day >= 21 && month == 5))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Gemini");
			}
		}
		
		else if (((day <= 20 && month == 7) || (day >= 21 && month == 6))) {

			if (day > 30) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Cancer");
			}
		}
		
		else if (((day <= 20 && month == 8) || (day >= 21 && month == 7))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Leo");
			}
		}
		
		else if (((day <= 20 && month == 9) || (day >= 21 && month == 8))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Virgo");
			}
		}
		
		else if (((day <= 20 && month == 10) || (day >= 21 && month == 9))) {

			if (day > 30) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Libra");
			}
		}
		
		else if (((day <= 20 && month == 11) || (day >= 21 && month == 10))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Scorpio");
			}
		}
		
		else if (((day <= 20 && month == 12) || (day >= 21 && month == 11))) {

			if (day > 30) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Sagittarius");
			}
		}
		
		else if (((day <= 20 && month == 1) || (day >= 21 && month == 12))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Capricorn");
			}
		}
		
		else if (((day <= 20 && month == 2) || (day >= 21 && month == 1))) {

			if (day > 31) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Aquarius");
			}
		}
		
		else if (((day <= 20 && month == 3) || (day >= 21 && month == 2))) {

			if (day > 28) {

				System.out.println("No such a date.");
			}

			else {

				System.out.println("Pisces");
			}
		}
		
		else if(month > 12 || month == 0){
			
			System.out.println("No such a date.");
		}

		
		
	}

}
