public class Movie {

	private String director;
	private String name;
	private Integer year;
	private Boolean oscar;
	private String genre;
	private Double IMDB;

	// these above are attributes of our class Movie

	public Movie(String director, String name, Integer year, Boolean oscar,
			String genre, Double IMDB) {
		this.director = director;
		this.name = name;
		this.year = year;
		this.oscar = oscar;
		this.genre = genre;
		this.IMDB = IMDB;

	}

	// this is automatically generated constructor

	public String toString() {
		String s = "";
		s = s + "Director: " + director + "\n";
		s = s + "Name: " + name + "\n";
		s = s + "Year: " + year + "\n";
		s = s + "Oscar: " + oscar + "\n";
		s = s + "Genre: " + genre + "\n";
		s = s + "IMDB: " + IMDB + "\n";

		return s;
	}

	// our method toString is converting every type toString and writing it out

	public static void main(String[] args) {
		Movie one = new Movie("James Wan", "Furious Seven", 2015, false,
				"Action", 7.7);

		System.out.println(one.toString());

		Movie two = new Movie("Glenn Ficara", "Focus", 2015, false,
				"Comedy, Crime, Drama", 6.6);

		System.out.println(two.toString());
	}
	
	// we are testing our method toString in a main method

}
