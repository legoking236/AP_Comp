
/**
 * Write a description of class rock_paper_scissors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors
{
    public static void main (String args[]) {
        Random chooser = new Random();
        Scanner choice = new Scanner(System.in);
        boolean play = true;
        String player_choice, computer_choice = "null";
        int computer_comp, player_comp;
        player_comp = 0;
        
        System.out.println ("Rock, paper, or scissors? Type stop, to quit.");
        player_choice = choice.nextLine();
        
        while (play) {
            computer_comp = chooser.nextInt(3) + 1;
            
            if (player_choice.toLowerCase().equals("rock")) {
                player_comp = 1;
            } else if (player_choice.toLowerCase().equals("paper")) {
                player_comp = 2;
            } else if (player_choice.toLowerCase().equals("scissors")) {
                player_comp = 3;                
            } else if (player_choice.toLowerCase().equals("stop")) {
                player_comp = 0;
            } else {
                System.out.println ("That's not a vallid choice, try again!");
                player_choice = choice.nextLine();
            }
            
            if (computer_comp == 1) {
                computer_choice = "rock";
            } else if (computer_comp == 2) {
                computer_choice = "paper";
            } else if (computer_comp == 3) {
                computer_choice = "scissors";
            }
            if (player_comp == 0) {
                play = false;
            } else if (player_comp == computer_comp) {
                System.out.println ("It's a tie! We both chose " + computer_choice);
                System.out.println ("Lets play again! Rock, paper, or scissors? Type stop, to quit.");
                player_choice = choice.nextLine();
            } else if (player_comp == 1 && computer_comp == 3) {
                System.out.println ("Your " + player_choice + " has defeated my " + computer_choice);
                System.out.println ("Lets play again! Rock, paper, or scissors? Type stop, to quit.");
                player_choice = choice.nextLine();
            } else if (player_comp == 2 && computer_comp == 1) {
                System.out.println ("Your " + player_choice + " has defeated my " + computer_choice);
                System.out.println ("Lets play again! Rock, paper, or scissors? Type stop, to quit.");
                player_choice = choice.nextLine();
            } else if (player_comp == 3 && computer_comp == 2) {
                System.out.println ("Your " + player_choice + " has defeated my " + computer_choice);
                System.out.println ("Lets play again! Rock, paper, or scissors? Type stop, to quit.");
                player_choice = choice.nextLine();
            } else {
                System.out.println ("My " + computer_choice + " has defeated your " + player_choice);
                System.out.println ("Lets play again! Rock, paper, or scissors? Type stop, to quit.");
                player_choice = choice.nextLine();
            }
        }
        System.out.println ("Thanks for playing!");
    }
}
