package ba.bitcamp.homework03.task03;

public class Pet {
	private String name;
	private int age;
	private String species;

	public Pet(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String toString() {
		return String.format("Name of pet: %s\nPets age: %d\nSpecies: %s",
				name, age, species);
	}

}
