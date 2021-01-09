/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 * Name: Saahibdeep Dhaliwal 
 * Course Code: ICS 3U1 
 * Teacher: Mr. Wilkes
 * Date:October 14, 2020 
 * Program Description: This program creates a rock paper scissors game where 
 * the user can input their move and the program randomly generates the 
 * computer's move. The moves are compared and the result (win, loss, or tie) is 
 * outputted to the user and added to the total wins, losses, or ties. 
 * The user can keep playing. 
 */

//Import toolkits
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    //Declare static variables used across methods
    static String result;
    static int computerNum;
    //Declare and assign static variables for total wins, losses, and ties
    static int wins = 0;
    static int ties = 0;
    static int losses = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Display the main header
        System.out.println("ROCK PAPER SCISSORS");
        System.out.println("===================");
       
        int tryAgain = 1;
        do {
            //Display the options and let the user input their move
            System.out.println();
            System.out.println("===========");
            System.out.println("1=Rock");
            System.out.println("2=Paper");
            System.out.println("3=Scissors");
            System.out.println("===========");
            System.out.println("Choose your move (choose a number from 1-3):");
            int choice = Integer.parseInt(br.readLine());
            //Display an error message and let them try again if they input an integer that is not 1-3
            do {
                if ((choice < 1) || (choice > 3)) {
                    System.out.println("\nInvalid move entered.");
                    System.out.println("Choose a number from 1-3:");
                    choice = Integer.parseInt(br.readLine());
                    
                }
            } while ((choice < 1) || (choice > 3));
            //Declare array and set elements for moves
            String[] moves = {"Rock", "Paper", "Scissors"};
            //Display the user's move
            System.out.println("\nYou have chosen " + moves[choice - 1] + ".");
            computerNum=randomWholeNumber(1, 3);
            //Display the computer's move
            System.out.println("The computer has chosen " + moves[computerNum - 1] + ".");
            determineOutcome(computerNum, choice);
            //Display the result of comparing the user's move and the computer's move
            System.out.println(result);
            //Display the total wins, losses, and ties
            System.out.println("\n===========");
            System.out.println("WINS: " + wins);
            System.out.println("LOSSES: " + losses);
            System.out.println("TIES: " + ties);
            System.out.println("===========");
            //Let the user play again
            System.out.println("\nEnter 1 to play again.");
            tryAgain = Integer.parseInt(br.readLine());//user decides to try again
        } while (tryAgain == 1);
    }

    public static void determineOutcome(int computerChoice, int userChoice) {
        //Compare the user's choice to the computer's random number and assign a result and add to the total wins, losses, and ties
        if (userChoice == computerChoice) {
            result = ("\nYOU'VE TIED");
            ties = ties + 1;
        } else if ((userChoice == 1) && (computerChoice == 3)) {
            result = ("\nYOU'VE WON");
            wins = wins + 1;
        } else if ((userChoice == 2) && (computerChoice == 1)) {
            result = ("\nYOU'VE WON");
            wins = wins + 1;
        } else if ((userChoice == 3) && (computerChoice== 2)) {
            result = ("\nYOU'VE WON");
            wins = wins + 1;
        } else if ((userChoice == 3) && (computerChoice == 1)) {
            result = ("\nYOU'VE LOST");
            losses = losses + 1;
        } else if ((userChoice == 1) && (computerChoice == 2)) {
            result = ("\nYOU'VE LOST");
            losses = losses + 1;
        } else if ((userChoice == 2) && (computerChoice == 3)) {
            result = ("\nYOU'VE LOST");
            losses = losses + 1;
        }
    }

// This is method randomWholeNumber and requires a main method to work
// highNumber the maximum value desired
// lowNumber the minimum value desired
// returns a random whole number from highNumber to lowNumber inclusive
    public static int randomWholeNumber(int lowVal, int highVal) {
        //Continue to generate a random number until the number is
        //within the user's range
        int randNum;
        do {
            randNum = 0;//resets random number
            //generates and returns a random number within user's range
            randNum = (int) ((Math.random() * highVal) + 1);
        } while ((randNum > highVal) || (randNum < lowVal));
        return (randNum);
    }
}
