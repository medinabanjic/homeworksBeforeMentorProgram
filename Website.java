public class Website {

	public static void main(String[] args) {

		String website = "www.nekastranica.com?name=Jon&surname=Stark";
		int lengthOfUrl = website.length();

		// given a website we find its URL length

		int counter = 0;
		String surname = " ";
		String name = " ";
		String invert = " ";
		String invertN = " ";

		// counters, inverters, name and surename

		for (int i = lengthOfUrl - 1; i > 0; i--) {
			char reader = website.charAt(i);
			if (reader != '=') {
				surname += reader;
				counter++;
			} else {
				break;
			}
		}

		// we read character by character till we get to = sign

		int surenameLength = surname.length();
		for (int j = surenameLength - 1; j >= 0; j--) {
			char reader1 = surname.charAt(j);
			invert += reader1;

			// we find the length of a value that we get and then we invert it
			// to get a surename
			// as we were reading characters from the right side
		}
		counter += 10;
		for (int d = lengthOfUrl - counter; d > 0; d--) {
			char reader2 = website.charAt(d);
			if (reader2 != '=') {
				name += reader2;
			} else {
				break;
			}
		}

		// we already counted the lenth of a surename with counter now we add
		// 10, for the rest of characters till the name begins
		// we do the same

		int nameLength = name.length();
		for (int e = nameLength - 1; e >= 0; e--) {
			char reader3 = name.charAt(e);
			invertN += reader3;
		}

		// same bla bla :)

		System.out.printf("%s%s ", invertN, invert);

		// print it out, TA DAAA :)

	}
}
