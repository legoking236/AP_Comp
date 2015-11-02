
/**
 * Determine if an inputed year is a leap year.
 * 
 * @author Alex Probst 
 * @version -0.0.1
 */
import java.util.Scanner;

public class leap_year
{
    public static void main (String[] args)
    {
        int year; //defines year
        Scanner scan = new Scanner(System.in); //make new scanner
        
        System.out.println ("What year would you like test: ");
        year = scan.nextInt(); //asks for input of year
        
        if (year >= 1582)
        
           if (year % 4 == 0 && year % 100 != 0)
               System.out.println ("The year " + year + " is a leap year");
           else
               if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)     
                  System.out.println ("The year " + year + " is a leap year");
               else    
                  System.out.println ("The year " + year + " is not a leap year");    
        else 
           System.out.println ("Years before this date were not part of the gregorian calendar, therefore they can't be tested."); //is not before 1582
    }
}
