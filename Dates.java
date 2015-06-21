package ba.bitcamp.medina.banjic;

public class Dates {

	public static void main(String[] args) {


		int day1= 23;
		int day2= 24;
		
		int month1= 4;
		int month2= 3;
		
		int year1= 2016;
		int year2= 2016;
		
		// I declared a variables for two dates, day, month and a year
		// I made an IF statement which will calculate and write out which of the given dates comes first
		// If the years are same, compare months, if same days, if same print out same
		// if days different print out that the first date is with the lower day, else second date
		// if months are different print out that the first date is with lower month, else second date
	    // and if years are different print out that the first date is with lower year, else second
			
		if (year1 == year2){
			
			if (month1 == month2){
				
				if (day1 == day2){
					
					System.out.println("These two dates are the same.");
				}
				else if (day1 < day2){
					
					System.out.printf("Date %d. %d. %d. will come first.", day1, month1, year1);
				}
				else {
					
					System.out.printf("Date %d. %d. %d. will come first.", day2, month2, year2);
				}
			    }
				
			else if(month1 < month2){
					
				System.out.printf("Date %d. %d. %d. will come first.", day1, month1, year1);
					
				}
			
			else {
				
				System.out.printf("Date %d. %d. %d. will come first.", day2, month2, year2);
			}
			}
		
		else if(year1 < year2){
			
			System.out.printf("Date %d. %d. %d. will come first.", day1, month1, year1);
		}
		
		else {
			
			System.out.printf("Date %d. %d. %d. will come first.", day2, month2, year2);
		}

		
		}
}
