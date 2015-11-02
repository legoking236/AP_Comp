
/**
 * Write a description of class mpg_calculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class mpg_calculator
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int begining_odo, end_odo;
        double gas_used;
        
        System.out.println ("What was the odometer reading at the begining of the trip?: ");
        begining_odo = scan.nextInt();
        
        System.out.println ("What was the odometer reading at the end of the trip?: ");
        end_odo = scan.nextInt();
        
        System.out.println ("How many gallong of gasoline did you use?: ");
        gas_used = scan.nextDouble();
        
        int miles_traveled;
        double mpg;
        
        miles_traveled = end_odo - begining_odo;
        mpg = miles_traveled / gas_used;
        
        System.out.println ("Through your " + miles_traveled + " mile trip you got " + mpg + " per gallon.");
    }
}
