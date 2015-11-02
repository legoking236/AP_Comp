
/**
 * Gets 2 sets of codinates and calculates the distance between them
 * 
 * @author Alex Probst
 * @version -0.0.1
 */
import java.util.Scanner;

public class distance
{
    public static void main (String[] args)
    {
        int X1, Y1, X2, Y2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("What is the first X coordinate?: ");
        X1 = scan.nextInt();
        
        System.out.println ("What is the first Y coordinate?: ");
        Y1 = scan.nextInt();
        
        System.out.println ("What is the second X coordinate?: ");
        X2 = scan.nextInt();
        
        System.out.println ("What is the second Y coordinate?: ");
        Y2 = scan.nextInt();
        
        int sqrt_number;
        double distance;
        
        int x_result = X2 - X1;
        int y_result = Y2 - Y1;
        
        x_result = (int) Math.pow(x_result, 2);
        y_result = (int) Math.pow(y_result, 2);
        
        sqrt_number = x_result - y_result;
        distance = Math.sqrt(sqrt_number);
        
        System.out.println ("The distance between (" + X1 + "," + Y1 + ") and (" + X2 + "," + Y2 + ") is: " + distance);
    }
}
