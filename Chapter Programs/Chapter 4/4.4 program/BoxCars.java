
/**
 * Write a description of class BoxCars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxCars
{
    public static void main (String[] args)
    {
        int num_rolls, num_boxcars, run;
        num_rolls = 1000;
        num_boxcars = 0;
       
        PairOfDice die1 = new PairOfDice();
        PairOfDice die2 = new PairOfDice();
        
        for (run=1; run <= num_rolls; run++)
        {
            die1.Roll();
            die2.Roll();
            
            if(die1.isSix() && die2.isSix())
            {
                num_boxcars++;
            }
        }
        System.out.println("Number or rolls 1000.");
        System.out.println("Boxcars: " + num_boxcars);
    }
}
