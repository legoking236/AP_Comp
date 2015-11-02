
/**
 * Number guessing game
 * 
 * @author Alex Probst
 * @version -0.0.1
 */
import java.util.Random; //imports random utility
import java.util.Scanner; //imports scanner utility

public class Hi_Lo //defines class
{
    public static void main (String[] args) //main
    {
        Random generator = new Random(); //new random generator
        Scanner guess = new Scanner(System.in); //new scanner for guesses
        Scanner answer = new Scanner(System.in); //new scanner for answers
        int random, test_var; //intigers for random number and user guesses
        boolean play = true; //test for if user wants to play or quit
        String user_answer, user_guess; //string for answers to restart questions
        
        random = generator.nextInt(100) + 1; //generation number between 1 and 100 inclusivley
        System.out.println ("Guess a number between 1 and 100.\nEnter quit to quit: "); //promps for guess
        user_guess = guess.nextLine(); //reads keyboard input
        
        while (play) //tests play, if while its true the game will be played
        {   
            if (user_guess.toLowerCase().equals("quit")) //checks if user gave value indicaiing they want to quit
            {
                //asks if they want to play again
                System.out.println ("Thanks for playing! Do you want to play again? (yes/no): ");
                user_answer = answer.nextLine(); //gets user input
                if (user_answer.toLowerCase().equals("yes")) //makes users input lowercase and checks for yes
                {
                    random = generator.nextInt(100) + 1; //generates new number to restart game
                    System.out.println ("Guess a number between 1 and 100.\nEnter quit to quit: "); //promps for guess
                    user_guess = guess.nextLine(); //reads keyboard input
                } else { //checks if no, or anything besides yes
                    play = false; //ends the game
                }
            } else { //if user does not want to quit, start game!
                test_var = Integer.parseInt(user_guess); //converts the string to an int
                if (test_var > random && test_var < 101) { //checks if guess is grater than random and less than 100
                    System.out.println ("Your guess is high"); //promps fo new guess
                    user_guess = guess.nextLine(); //reads keyboard input
                } else if (test_var < random && test_var >= 1) { //checks if guess is less than random but greater than 1
                    System.out.println ("Your guess is low"); //promps for new guess
                    user_guess = guess.nextLine(); //reads keyboard input
                } else if (test_var == random) { //checks if the guess is equal to random
                    System.out.println ("Your guess is right! Do you want to play again?! (yes/no):"); //asks if user wants to play again
                    user_answer = answer.nextLine(); //reads keyboard input
                    if (user_answer.toLowerCase().equals("yes")) //makes users input lowercase and checks for yes
                    {
                        random = generator.nextInt(100) + 1; //generates new number to restart game
                        System.out.println ("Guess a number between 1 and 100.\nEnter quit to quit: "); //promps for guess
                        user_guess = guess.nextLine(); //reads keyboard input
                    } else { //checks if no, or anything besides yes
                        play = false; //ends the game
                    }
                } else if (test_var > 100) { //checks if value is greater than 100
                    System.out.println ("Woah! only numbers between 1 and 100 please!"); //promps for new guess
                    user_guess = guess.nextLine(); //reads keyboard input
                } else if (test_var < 1) { //checks if value is less than 1
                    System.out.println ("Woah! only numbers between 1 and 100 please!"); //promps for new guess
                    user_guess = guess.nextLine(); //reads keyboard input
                } else { //checks for anything else
                    System.out.println ("I cant make heads or tails of what you entered!"); //promps for new guess
                    user_guess = guess.nextLine(); //reads keyboard input
                }
            }
        } 
        System.out.println ("Thanks for playing! goodbye!"); //game has been quit, machiene prints goodbye
    }
}
