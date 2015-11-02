
/**
 * Rolls two dice
 * 
 * @author Alex Probst
 * @version -0.0.1
 */
import java.util.Random;

public class PairOfDice
{
    Random random_roll = new Random();
    private int roll_value;
    public int Die()
    {
        Roll();
        return roll_value;
    }
    public void Roll()
    {
        roll_value = random_roll.nextInt(6) + 1;
    }
    public boolean isSix()
    {
        return roll_value == 6;
    }
}
