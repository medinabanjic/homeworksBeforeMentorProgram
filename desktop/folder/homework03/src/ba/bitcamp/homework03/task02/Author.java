package ba.bitcamp.homework03.task02;

public class Author {
	/**
	 * Properties of author
	 */
	private String name;
	private String e_mail;
	private boolean gender;
	
	/**
	 * Creating constructors
	 * @param authorName Name of author
	 * @param mail Author mail
	 * @param gender Gives us opportunity to decide if author is male or female
	 */
	
	public Author(String authorName, String mail, boolean gender) {
		this.name = authorName;
		this.e_mail = mail;
		this.gender = gender;
	}
	/**
	 * Returns name of author
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Gives user opportunity to set authors name
	 * @param authorName
	 */
	public void setName(String authorName) {
		this.name = authorName;
	}
	/**
	 * Return author email
	 * @return
	 */
	public String getMail() {
		return e_mail;
	}
	/**
	 * Gives user opportunity to set authors email
	 * @param mail
	 */
	public void setMail(String mail) {
		this.e_mail = mail;
	}
	/**
	 * Returns if author is male or female (true or false)
	 * @return
	 */
	public boolean isMale() {
		return gender;
	}
	/**
	 * Gives user opportunity to set authors gender
	 * @param isMale
	 */
	public void setMale(boolean isMale) {
		this.gender = isMale;
	}
	/**
	 * Prints information about author
	 */
	public String toString() {
		return String.format("Author name: %s \nMail: %s\nAuthor is male? %b",
				name, e_mail, gender);
	}
}
