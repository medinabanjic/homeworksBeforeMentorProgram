package ba.bitcamp.homework03.task03;

public class Dog extends Pet{
	
	private String race;

	public Dog(String name, int age, String species, String race) {
		super(name, age, species);
		this.race = race;
	}

	public String getKind() {
		return race;
	}

	public void setKind(String kind) {
		this.race = kind;
	}
	
	public String toString(){
		String s = "Av Av";
		return s;
		
	}
}
