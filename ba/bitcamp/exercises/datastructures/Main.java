package ba.bitcamp.exercises.datastructures;

import java.util.Arrays;

public class Main {

	public static boolean isSameArtist(Song s1, Song s2) {

		boolean isSame = false;
		if (s1.artist.name.equals(s2.artist.name)) {

			isSame = true;
		}

		return isSame;
	}

	public static boolean isFromSoloArtist(Song s1) {

		boolean isSolo = s1.artist.isBand;

		if (isSolo = true) {
			isSolo = false;
		} else {
			isSolo = true;
		}

		return isSolo;
	}

	public static int countGenreNumber(Album a, String genre) {

		int counter = 0;

		for (int i = 0; i < a.songs.length; i++) {

			if (genre.equals(a.songs[i].genre)) {

				counter++;
			}

		}

		return counter;
	}

	public static Song getOlderSong(Song s1, Song s2) {
		System.out.println("\n\nThe older song is:");
		return (s1.year > s2.year) ? s2 : s1;
	}

	public static void printAlbumInformation(Album[] a, Song s) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].songs.length; j++) {

				if (a[i].songs[j].equals(s)) {

					System.out.println("\nSong " + s.name + " is on "
							+ a[i].name + " album.\n");
				}

				else if (i == a.length - 1 && j == a[i].songs.length) {

					System.out.println(s = null);
				}
			}

		}

	}

	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {

		int counter = 0;
		int[] songsPerAlbum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c.songsConcert.length; j++) {

				if (a[i].songs.equals(c.songsConcert[j])) {
					counter++;
				}

			}

			songsPerAlbum[i] = counter;

		}

		return songsPerAlbum;

	}

	public static void main(String[] args) {

		Artist[] ar = new Artist[3];
		ar[0] = new Artist("Sade", false, 1975, "Soul");
		ar[1] = new Artist("Michael Jackson", false, 1971, "Pop");
		ar[2] = new Artist("The Kelly Family", true, 1980, "Pop");

		Song[] sc = new Song[4];
		sc[0] = new Song(ar[0], "Smooth operator", 1984, "Soul");
		sc[1] = new Song(ar[1], "Earth song", 1995, "Pop");
		sc[2] = new Song(ar[1], "Black And White", 1991,
				"New jack swing - Rock");
		sc[3] = new Song(ar[2], "An Angel", 1994, "Soul");

		Song[] s = new Song[2];
		s[0] = new Song(ar[0], "Smooth operator", 1984, "Soul");
		s[1] = new Song(ar[1], "Earth song", 1995, "Pop");

		Song[] so = new Song[2];
		so[0] = new Song(ar[1], "Black And White", 1991,
				"New jack swing - Rock");
		so[1] = new Song(ar[2], "An Angel", 1994, "Soul");

		Album[] a = new Album[2];
		a[0] = new Album("Diamond Life", ar[0], s, "Soul");
		a[1] = new Album("Neki", ar[1], so, "Pop");

		Concert c = new Concert(ar, sc);

		// if (isSameArtist(s2, s3) == true) {
		//
		// System.out.println("\nThe artist of these two songs is the same.");
		// } else {
		//
		// System.out.println("\nThe artists for these songs are different.");
		// }
		//
		//
		//
		//
		// if (isFromSoloArtist(s1) == true) {
		//
		// System.out.println("\nThis is a song of a solo artist.");
		// } else {
		//
		// System.out.println("\nThis is a band song.");
		// }
		//
		//
		//
		// System.out.println("\n" + getOlderSong(s4, s1).toString());
		//
		//
		// System.out.println("There are " + countGenreNumber(al1, "Soul") +
		// " songs of this genre.\n");
		// System.out.println(al1.toString());

		// printAlbumInformation(a, so[0]);

		System.out.println(Arrays.toString(getNumberOfSongsPerAlbum(c, a)));

	}

}
