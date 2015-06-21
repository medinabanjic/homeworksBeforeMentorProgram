public class Strings {

	public static void mixedStrings(String s1, String s2) {

		int lengthF = s1.length();
		int lengthS = s2.length();
		String mix = "";

		if (lengthF < lengthS) {

			for (int i = 0; i < lengthF; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			mix = mix + s2.substring(lengthS - (lengthS - lengthF));
			System.out.println(mix);
		}

		else if (lengthS < lengthF) {

			for (int i = 0; i < lengthS; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			mix = mix + s1.substring(lengthF - (lengthF - lengthS));
			System.out.println(mix);
		}

		else {

			for (int i = 0; i < lengthS; i++) {

				mix = mix + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}

			System.out.println(mix);

		}

	}

	public static boolean sameLetters(String s1, String s2) {

		boolean consistAll = true;
		int counter = 0;

		if (s1.length() > s2.length()) {

			consistAll = false;
		}

		else {

			for (int i = 0; i < s1.length(); i++) {

				char letter = s1.charAt(i);
				int b = s2.indexOf(letter);

				if (b != -1) {

					counter++;

				}

			}

			if (counter == s1.length()) {

				consistAll = true;
			}

		}

		return consistAll;
	}
	
	
	
	
	

	public static void main(String[] args) {

		String n = "mede";
		String m = "medina";

		System.out.println(sameLetters(n, m));

	}
}
