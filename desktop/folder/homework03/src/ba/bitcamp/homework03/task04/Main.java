package ba.bitcamp.homework03.task04;

public class Main {
public static void main(String[] args) {
	try{
	Date d = new Date(32, 2);
	System.out.println(d);
	} catch (IllegalArgumentException e){
		System.out.println("The date is wrong!");
	}
}
}
