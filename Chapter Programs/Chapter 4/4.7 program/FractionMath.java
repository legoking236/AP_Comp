
/**
 * Write a description of class FractionMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FractionMath
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num, den;
        String command;
        boolean run = true;
        
        while(run == true)
        {
            System.out.println("Enter add, subtract, multiply, divide, or quit");
            command = input.nextLine();
            
            if(command.toLowerCase().equals("quit"))
            {
                run = false;
            } else if(command.toLowerCase().equals("add")){
                System.out.println("Numerator of fraction 1");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 1");
                den = input.nextInt();
                
                Rational f1 = new Rational(num, den);
                
                System.out.println("Numerator of fraction 2");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 2");
                den = input.nextInt();
                
                Rational f2 = new Rational(num, den);
                
                f1.add(f2);
                command = null;
            } else if(command.toLowerCase().equals("subtract")){
                System.out.println("Numerator of fraction 1");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 1");
                den = input.nextInt();
                
                Rational f1 = new Rational(num, den);
                
                System.out.println("Numerator of fraction 2");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 2");
                den = input.nextInt();
                
                Rational f2 = new Rational(num, den);
                
                f1.sub(f2);
                command = null;
            } else if(command.toLowerCase().equals("multiply")){
                System.out.println("Numerator of fraction 1");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 1");
                den = input.nextInt();
                
                Rational f1 = new Rational(num, den);
                
                System.out.println("Numerator of fraction 2");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 2");
                den = input.nextInt();
                
                Rational f2 = new Rational(num, den);
                
                f1.mul(f2);
                command = null;
            } else if(command.toLowerCase().equals("divide")){
                System.out.println("Numerator of fraction 1");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 1");
                den = input.nextInt();
                
                Rational f1 = new Rational(num, den);
                
                System.out.println("Numerator of fraction 2");
                num = input.nextInt();
                System.out.println("Denomenator of fraction 2");
                den = input.nextInt();
                
                Rational f2 = new Rational(num, den);
                
                f1.div(f2);
                command = null;
            } else {
                System.out.println("Not a valid option, press enter and try again");
                command = input.nextLine();
            }
        }
        System.out.println("Goodbye.");
    }
}
