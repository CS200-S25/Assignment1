import java.util.Scanner;

/**
 * Welcome to the beginning of your adventure game project! Before you begin 
 * in this file, read the instructions in README.md. Make a copy of this file 
 * in your project folder on your machine, which you will use throughout the 
 * semester.
 * 
 * Instructions:
 * Follow the inline instructions, where tasks are marked by "TODO:". In this 
 * file, you will accept user input and split that input into a format that 
 * the computer can understand. This will occur continuously until the user 
 * enters "q".
 * 
 * Finally, write  a description of the class and update the author and version
 * tags.
 * 
 * Write a description of class Game here.
 *
 * @author CS200 Instructors
 * @version 6.24.2024
 */
public class Game {
    
    Player p1;
    Room r0, r1, r2, r3;
    
    public Game(){
        
        // TODO: instantiate new objects for each of the four rooms r0, r1, r2, r3
        
        // TODO: for each of the four rooms, add their neighbors using the setNeighbors() method for each one
        
        p1 = new Player("player 1", "this is you!", r0);
        System.out.println("You are starting in: "+p1.getLocation());
    }
    
    /**
     * A method to perform an action based on user input. 
     * You should not modify this method.
     * 
     * @param input - a String from the user's input command.
     */
    public void parseCommand(String input) {
        
        String[] wordList = input.split("[\s]");
        String verb;
        String noun;
        
        if(wordList.length < 2 || wordList.length > 2) {
            System.out.println("Only 2 word commands allowed!");
        } else {
            verb = wordList[0];
            noun = wordList[1];
            switch (verb) {
                case "take":
                    //left for later
                case "drop":
                    //left for later
                case "eat":
                    //left for later
                case "go":
                    movePlayer(noun);
                    break;
                default:
                    System.out.println(verb + " is not a known verb!");
            }
        }
    }
    
    public void movePlayer(String direction) {
        Room room = p1.getLocation();
        switch (direction) {
            case "North":
                p1.setLocation(room.getN());
                break;
            case "South":
                p1.setLocation(room.getS());
                break;
            case "East":
                p1.setLocation(room.getE());
                break;
            case "West":
                p1.setLocation(room.getW());
                break;
            default:
                System.out.println("Unknown direction, player did not move.");
        }
        System.out.println("You are now in: "+p1.getLocation());
    }

    
    public static void main(String[] args){
        Game gm = new Game();
        Scanner scan = new Scanner(System.in);
        String input = "";

        // TODO: write an introduction for your game that will be displayed to the user 
        // Let the user know what they can do and how to quit, the user quits by entering 'q'
        
        while(!input.equals("q")) {
            input = scan.nextLine();
            if(input.equals("q")) {
                System.out.println("Thanks for playing!");
                break;
            }else{
                gm.parseCommand(input);
            }
        }
        scan.close();
    }
    
}
