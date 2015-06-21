package ba.bitcamp.homework03.task01;

public class Main {

	public static void main(String[] args) {
		String word = "golub";
		String s = "golubica";
		
		char[] letters = new char[word.length()];
		

		for (int i = 0; i < word.length(); i++) {
			letters[i] = word.charAt(i);
		}

		CampStringBuilder cs = new CampStringBuilder(letters);
		cs.append(s);
		cs.prepend(s);

	}

}
