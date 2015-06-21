package ba.bitcamp.exercises.datastructures;

public class Artist {
	
	public String name;
	public boolean isBand;
	public Integer year;
	public String genre;
	
	
	
	public Artist(String name, boolean isBand, Integer year, String genre) {
		super();
		this.name = name;
		this.isBand = isBand;
		this.year = year;
		this.genre = genre;
	}

	@Override
	public String toString() {
		String s = "";
		s = "Name: " + name + "\n";
		s += "Year: " + year + "\n";
		s += "Genre: " + genre + "\n";
		
		
		return s;
	}
}
