import java.util.Scanner;
import java.util.Random;
/**
 * Instructions:
 * This program takes user input and plays rock paper scissors with the user,
 * choosing randomly from the three options. Follow the instructions.  
 * Test your code by playing the game.
 * 
 * Finally, add a description of the class and update the author and version
 * tags.
 * 
 * Write a description of class RPS here.
 * 
 * NOTE: Tasks you must complete are preceded by "TODO:". Your submission to Gradescope must
 * not contain any remaining TODO (including the two in this paragraph). Replace this entire
 * comment section with your own class description comment.
 *
 * @author CS200 Instructors
 * @version Spring 2025
 */
public class RPS
{
    // This class contains 4 instance variables:
    int playerPoints;
    int computerPoints;
    String computerChoice;
    String[] options = {"Rock", "Paper", "Scissors"}; // this array contains the options for 
                                                      // choices in the game
                                                      // we will learn about arrays later
    
    /**
     * Constructor initializes the player's and computer's scores to zero and 
     * generates the computer's initial choice.
     */
    public RPS(){
        playerPoints = 0;
        computerPoints = 0;
        newComputerChoice();
    }
    
    /**
     * Generates a new random choice for the computer from the options array.
     */
    public void newComputerChoice(){
        //the random object is a random number generator
        Random rand = new Random();
        //initializing computer's choice
        computerChoice = options[rand.nextInt(options.length)];
    }
    
    /**
     * Retrieves the computer's current choice.
     *
     * @return the computer's choice ("Rock", "Paper", or "Scissors").
     */
    public String getComputerChoice(){
        return computerChoice;
    }
    
    /**
     * Displays the current score summary for the player and the computer.
     */
    public void pointsSummary(){
        /* TODO: print a summary of the points */
    }
    
    /**
     * Determines the winner of the current round based on the player's and
     * computer's choices and updates the scores accordingly.
     *
     * @param userChoice the player's choice ("Rock", "Paper", or "Scissors").
     */
    public void checkWinner(String userChoice){
        /*
             * TODO: Fill in the conditional statements below. They are all
             * conditional statements between userChoice, computerChoice,
             * and integers. There are three ways for the user to lose, and
             * one way for them to tie. The situation where the user wins
             * has been filled in at the bottom.
             */
            
        System.out.println("The computer played: "+computerChoice);
        System.out.println("You played: "+userChoice);
            
        if (/* TODO: complete this */) {
            // No points are added, nothing else to do
            System.out.println("Tie!");
        }else if (/* TODO: complete this */) {
            /* TODO: complete this to commulate points */
            System.out.println("You lose. Computer wins.");
        }else if (/* TODO: complete this */) {
            /* TODO: complete this to commulate points */
            System.out.println("You lose. Computer wins.");
        }else if (/* TODO: complete this */) {
            /* TODO: complete this to commulate points */
            System.out.println("You lose. Computer wins.");
        }else {
            /* TODO: complete this to commulate points */
            System.out.println("Congrats, you win!");
        }
        System.out.println("");
    }
    
    // This is the main method for the RPS class:
    public static void main(String[] args) {
        
        /*
         * TODO: initialize a new RPS instance
         * Take a moment to think deeply about why you need to do this here
         */
        
        
        /*
         * Some objects have been initialized for you.
         * The scanner takes in user input from System.in, the keyboard.
         */
        Scanner scan = new Scanner(System.in);
        
        /*
         * TODO: initialize a boolean variable so that we will know if the 
         * user wants to continue the game. Set it to true.
         */
        
        
        //intializing loop, so that the game continues until the user enters 'End'
        while (/* TODO: fill this in */) {
            /*
             * TODO: Ask the user to enter one of the available options 
             * (Rock, Paper, and Scissors) with the same capitalization
             * or enter "End" to end the game.
             */
            
            //take in user's choice
            String userChoice = scan.next();
            
            /*
             * TODO: Write an if statement that checks if the user has ended the game. 
             * If so, print a thank you message and the game points summary.
             * Also set the boolean variable to false so that the loop will end.
             * Otherwise, check the winner of the current game and make a new computer choice.
             */
            
            
        }
        //close the scanner
        scan.close();
    }
}
