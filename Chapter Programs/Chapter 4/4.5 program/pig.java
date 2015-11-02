
/**
 * Write a description of class pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class pig
{
    public static void main (String[] args)
    {
        int player_points = 0, computer_points = 0, player_turn_points = 0, computer_turn_points = 0;
        boolean play = false, player_play = false, computer_play = false;
        String command, ingame_command;
        
        Scanner player_entry = new Scanner(System.in);
        
        System.out.println("Welcome to Pig! Enter 'play' to start!");
        command = player_entry.nextLine();
        
        if(command.toLowerCase().equals("play"))
        {
            play = true;
            player_play = true;
        } else {
            System.out.println("Unrecognized command, try again");
            command = player_entry.nextLine();
        }
        while (play == true) {
            if(player_points >= 100) {
                System.out.println("player wins! With " + player_points + "; Computer had " + computer_points);
                player_play = false;
                computer_play = false;
                play = false;
            } else if (computer_points >= 100) {
                System.out.println("Computer wins! With " + computer_points + "; You had " + player_points);
                computer_play = false;
                player_play = false;
                play = false;
            }
            while (player_play == true)
            {
                System.out.println("Computer points for this game: " + computer_points);
                System.out.println("Current points for this turn: " + player_turn_points);
                System.out.println("Current points for this game: " + player_points);
                System.out.println("Do you want to: pass or roll");
                ingame_command = player_entry.nextLine();
                if(ingame_command.toLowerCase().equals("roll")) {
                    player_turn turn = new player_turn();
                    turn.play(player_points);
                    if(turn.rollValue() < 0) {
                        player_points = 0;
                        
                        player_play = false;
                        computer_play = true;
                    } else if(turn.rollValue() == 0) {
                        player_turn_points = 0;
                        
                        player_play = false;
                        computer_play = true;
                    } else {
                        player_turn_points += turn.rollValue();
                        if(player_points >= 100) {
                            System.out.println("You win!");
                            player_play = false;
                            play = false;
                        }
                    }
                } else if(ingame_command.toLowerCase().equals("pass")) {
                    player_points += player_turn_points;
                    player_turn_points = 0;
                    if(player_points >= 100) {
                        System.out.println("player wins! With " + player_points + "; Computer had " + computer_points);
                        player_play = false;
                        computer_play = false;
                        play = false;
                    } else if (computer_points >= 100) {
                        System.out.println("Computer wins! With " + computer_points + "; You had " + player_points);
                        computer_play = false;
                        player_play = false;
                        play = false;
                    } else {
                        player_play = false;
                        computer_play = true;
                    }
                } else {
                    System.out.println("Unrecognized command! Try again!");
                    ingame_command = player_entry.nextLine();
                }
            }
            while (computer_play == true)
            {
                computer_turn turn = new computer_turn();
                turn.play(computer_points);
                if(turn.rollValue() < 0) {
                    computer_points = 0;
                    
                    computer_play = false;
                    player_play = true;
                } else if(turn.rollValue() == 0) {
                    computer_turn_points = 0;
                    
                    computer_play = false;
                    player_play = true;
                } else {
                    computer_turn_points += turn.rollValue();
                    if(computer_turn_points >= 20) {
                        computer_points += computer_turn_points;
                        computer_turn_points = 0;
                        if(player_points >= 100) {
                            System.out.println("You wins! With " + player_points + "; Computer had " + computer_points);
                            player_play = false;
                            computer_play = false;
                            play = false;
                        } else if (computer_points >= 100) {
                            System.out.println("Computer wins! With " + computer_points + "; You had " + player_points);
                            computer_play = false;
                            player_play = false;
                            play = false;
                        } else {
                            computer_play = false;
                            player_play = true;
                        }
                    } else if(computer_points >= 100) {
                        System.out.println("Computer wins!");
                        play = false;
                        computer_play = false;
                    }
                }
            }
        }
        System.out.println("Thanks for playing!");
    }
}

