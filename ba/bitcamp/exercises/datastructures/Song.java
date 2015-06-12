package ba.bitcamp.exercises.datastructures;

public class Song {
	
	public Artist artist;
	public String name;
	public Integer year;
	public String genre;
	
	
	public Song(Artist artist, String name, Integer year, String genre) {
		super();
		this.artist = artist;
		this.name = name;
		this.year = year;
		this.genre = genre;
	}
	
	public String toString() {
		String s = "";
		s = "\nName: " + name + "\n";
		s += "Artist: " + artist.name + "\n";
		s += "Year: " + year + "\n";
		s += "Genre: " + genre + "\n";
		
		
		return s;
	}

}
