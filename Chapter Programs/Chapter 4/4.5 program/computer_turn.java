
/**
 * Write a description of class computer_turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class computer_turn
{
    int roll_points;
    public void play(int computer_points)
    {

        PairOfDice die1 = new PairOfDice();               
        PairOfDice die2 = new PairOfDice();
        
        die1.Roll();
        die2.Roll();
        
        if(die1.RollValue() == 1 && die2.RollValue() == 1) {
            System.out.println("Computer lost all their points!");
            roll_points = 0 - computer_points; 
        } else if (die1.RollValue() == 1 || die2.RollValue() == 1) {
            System.out.println("Computer lost all thier points for this round!");
            roll_points = 0;
        } else {
            roll_points += die1.RollValue() + die2.RollValue();
            System.out.println("Computer got " + roll_points + " points!");
        }
    }
    public int rollValue()
    {
        return roll_points;
    }
}
