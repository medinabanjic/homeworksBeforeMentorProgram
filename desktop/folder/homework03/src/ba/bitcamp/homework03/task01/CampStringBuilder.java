package ba.bitcamp.homework03.task01;

import java.util.Arrays;

public class CampStringBuilder {

	private char[] characters = new char[16];

	/**
	 * Constructor
	 * 
	 * @param characters
	 */
	public CampStringBuilder(char[] characters) {
		super();
		this.characters = characters;
	}

	/**
	 * Adds characters at the end of char array
	 * 
	 * @param o
	 */
	public void append(Object o) {

		char[] perm = new char[o.toString().length()];
		String word2 = o.toString();
		for (int j = 0; j < word2.length(); j++) {
			perm[j] = word2.charAt(j);
		}

		char[] ch = new char[perm.length + characters.length];


		for (int i = 0; i < characters.length ; i++){
			ch[i] = characters[i];
		}
		
		for (int i = characters.length; i < ch.length; i++){
			ch[i] = perm[i - characters.length];
		}
		
		System.out.println(Arrays.toString(ch));
	}

	/**
	 * Adds character at the beginning of char array
	 * 
	 * @param o
	 */
	public void prepend(Object o) {
		char[] perm = new char[o.toString().length()];
		String word2 = o.toString();
		for (int j = 0; j < word2.length(); j++) {
			perm[j] = word2.charAt(j);
		}

		System.out.println();
		
		char[] ch = new char[perm.length + characters.length];


		for (int i = 0; i < perm.length ; i++){
			ch[i] = perm[i];
		}
		
		for (int i = perm.length; i < ch.length; i++){
			ch[i] = characters[i - perm.length];
		}
		
		System.out.println(Arrays.toString(ch));
	}

}
