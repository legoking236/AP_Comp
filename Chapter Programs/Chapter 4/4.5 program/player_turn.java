
/**
 * Write a description of class player_turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class player_turn
{
    int roll_points;
    public void play(int player_points)
    {
        PairOfDice die1 = new PairOfDice();               
        PairOfDice die2 = new PairOfDice();
        
        die1.Roll();
        die2.Roll();
        
        if(die1.RollValue() == 1 && die2.RollValue() == 1) {
            System.out.println("You loose all your points!");
            roll_points = 0 - player_points; 
        } else if (die1.RollValue() == 1 || die2.RollValue() == 1) {
            System.out.println("You loose your points for this round!");
            roll_points = 0;
        } else {
            roll_points += die1.RollValue() + die2.RollValue();
            System.out.println("You got " + roll_points + " points!");
        }
    }
    public int rollValue()
    {
        return roll_points;
    }
}