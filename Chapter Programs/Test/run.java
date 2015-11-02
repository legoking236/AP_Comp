
/**
 * Write a description of class run here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class run
{
    public static void main(String args[]){
        int SevenEleven = 0;
        for(int i = 0; i >= 100; i++) {
            PairOfDice die1 = new Die();
            PairOfDice die2 = new Die();
            die1.Roll();
            die2.Roll();
            if(die1 + die2 == 7 || die1 + die2 == 11) {
                SevenEleven++;
            }
        }
        return SevenEleven;
    }
}
