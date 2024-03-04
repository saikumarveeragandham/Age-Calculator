import java.time.LocalDate;
import java.time.Period;

public class Agecal {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate birthdate=LocalDate.of(1996,8,25);
		
		Period age       = Period.between(today,birthdate);
		
		//To know that how many years the person has.
		int ageinyears   = Period.between(birthdate,today).getYears();
		
		//To know that how many months from your recent birth month.
		int ageinmonths  = Period.between(birthdate,today).getMonths();
		
		//To know that how many days the person has from your recent birth day.
		int ageindays    = Period.between(birthdate,today).getDays();
		
        System.out.println("Today Date      = "+today);
        
        System.out.println("Enter the date  = "+birthdate);
        
        System.out.print("Age             = "+ageinyears+" Years  ");
        
        System.out.print(ageinmonths+ " months  ");
        
        System.out.print(+ageindays+ " days");
	}

}
