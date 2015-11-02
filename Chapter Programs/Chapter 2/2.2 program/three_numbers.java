
/**
 * draws 3 numbers and gets their average, then uses the average a another floating point number to get the sum, product, and difference
 * 
 * @author Alex Probst
 * @version -0.0.1
 */
import java.util.Random;

public class three_numbers
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int first_number, second_number, third_number; //defines initgers for first half of program
        double result, fourth_number, sum, difference, product; //defines doubles for second half
        
        //generates first 3 numbers
        first_number = generator.nextInt(20) + 1;
        second_number = generator.nextInt(20) + 1;
        third_number = generator.nextInt(20) + 1;
        
        result = (first_number + second_number + third_number) / 3; //gets the average
        System.out.println ("The average of " + first_number + ", " + second_number + ", and " + third_number + " is: " + result + "\n"); //prints the average 
        
        fourth_number = generator.nextDouble() * 20; //gets the fourth number
        
        sum = result + fourth_number; //adds the result and fourth number
        difference = result - fourth_number; //subtracts the result and fourth number
        product = result * fourth_number; //multiplies the result and fourth number
        
        //prints the outcomes
        System.out.println ("The sum of " + result + " and " + fourth_number + " is: " + sum);
        System.out.println ("The difference of " + result + " and " + fourth_number + " is: " + difference);
        System.out.println ("The product of " + result + " and " + fourth_number + " is: " + product);
        
    }
}
