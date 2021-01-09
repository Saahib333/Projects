/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesscolourblocks;

/**
 * Name: Saahibdeep Dhaliwal 
 * Course Code: ICS 3U1 
 * Teacher: Mr. Wilkes
 * Date:October 15, 2020 
 * Program Description: This program hides three coloured blocks from the user
 * and lets the user guess the colour and order of the blocks. The program
 * outs put the users guesses and what the computer hid. Then the program
 * outputs how many of the colours were correct and how many of the positions
 * were correct. The user can then try again and input the correct positions and
 * colours or the user can start a new game.
 */

//Import toolkits
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    //Declare static varibales and arrays
    static String choice1, choice2, choice3;
    static String[] choices = new String[3];
    static String[] compChoices = new String[3];
    static String compChoice1, compChoice2, compChoice3;
    static int coloursCorrect;
    static int positionsCorrect;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Display main message
        System.out.println("Guess the Blocks");
        System.out.println("================");
        System.out.println("\nIn this game, there are four different coloured blocks "
                + "(red, green, blue, and yellow).");
        System.out.println("The computer hides three different coloured blocks from you. You then try to");
        System.out.println("guess the colours and the orders of the blocks.");
        int newGame = 2;//Initializes loop for new game
        do {
            System.out.println("\n================");
            //Generate randoms numbers outside of try again loop so the boxes the computer hid dont change 
            int compNum1 = randomWholeNumber(1, 4);
            int compNum2 = randomWholeNumber(1, 4);
            int compNum3 = randomWholeNumber(1, 4);
            int tryAgain = 1;//Initializes loop for trying again
            do {
                //Allow the user to input their guesses
                System.out.println("\nEnter your first guess (R, G, B, Y)");
                choice1 = (br.readLine());
                //Display an error message and let them try again if they input a letter that is not an option
                do {
                    if ((choice1.compareToIgnoreCase("R") != 0) && (choice1.compareToIgnoreCase("G") != 0) && (choice1.compareToIgnoreCase("B") != 0) && (choice1.compareToIgnoreCase("Y") != 0) && ((choice1.compareToIgnoreCase("G")) != 0)) {
                        System.out.println("\nInvalid first guess entered.");
                        System.out.println("Choose a letter that is R,G,B or Y:");
                        choice1 = br.readLine();
                    }
                } while ((choice1.compareToIgnoreCase("R") != 0) && (choice1.compareToIgnoreCase("G") != 0) && (choice1.compareToIgnoreCase("B") != 0) && (choice1.compareToIgnoreCase("Y") != 0) && ((choice1.compareToIgnoreCase("G")) != 0));
                System.out.println("\nEnter your second guess (R, G, B, Y)");
                choice2 = (br.readLine());
                //Display an error message and let them try again if they input a letter that is not an option
                do {
                    if ((choice2.compareToIgnoreCase("R") != 0) && (choice2.compareToIgnoreCase("G") != 0) && (choice2.compareToIgnoreCase("B") != 0) && (choice2.compareToIgnoreCase("Y") != 0) && ((choice2.compareToIgnoreCase("G")) != 0)) {
                        System.out.println("\nInvalid second guess entered.");
                        System.out.println("Choose a letter that is R,G,B or Y:");
                        choice2 = br.readLine();
                    }
                } while ((choice2.compareToIgnoreCase("R") != 0) && (choice2.compareToIgnoreCase("G") != 0) && (choice2.compareToIgnoreCase("B") != 0) && (choice2.compareToIgnoreCase("Y") != 0) && ((choice2.compareToIgnoreCase("G")) != 0));
                System.out.println("\nEnter your third guess (R, G, B, Y)");
                choice3 = (br.readLine());
                //Display an error message and let them try again if they input a letter that is not an option
                do {
                    if ((choice3.compareToIgnoreCase("R") != 0) && (choice3.compareToIgnoreCase("G") != 0) && (choice3.compareToIgnoreCase("B") != 0) && (choice3.compareToIgnoreCase("Y") != 0) && ((choice3.compareToIgnoreCase("G")) != 0)) {
                        System.out.println("\nInvalid third guess entered.");
                        System.out.println("Choose a letter that is R,G,B or Y:");
                        choice3 = br.readLine();
                    }
                } while ((choice3.compareToIgnoreCase("R") != 0) && (choice3.compareToIgnoreCase("G") != 0) && (choice3.compareToIgnoreCase("B") != 0) && (choice3.compareToIgnoreCase("Y") != 0) && ((choice3.compareToIgnoreCase("G")) != 0));
                //Display the user's guesses
                System.out.println("\nYour Guesses: " + choice1.toUpperCase() + " " + choice2.toUpperCase() + " " + choice3.toUpperCase());
                //Create an array for colours
                String[] colours = {"R", "G", "B", "Y"};
                //Assign a colour to the random numbers to create the computer's choice of colours
                compChoice1 = colours[compNum1 - 1];
                compChoice2 = colours[compNum2 - 1];
                compChoice3 = colours[compNum3 - 1];
                //Assign elements to choices array
                choices[0] = choice1;
                choices[1] = choice2;
                choices[2] = choice3;
                //Assign elements to computer choices array
                compChoices[0] = compChoice1;
                compChoices[1] = compChoice2;
                compChoices[2] = compChoice3;
                //Call methods
                checkPositionsCorrect();
                checkColoursCorrect();
                //Display the number of colours and positions that were correct
                System.out.println("\nNumber of Colours Correct = " + coloursCorrect);
                System.out.println("Number of Positions Correct = " + positionsCorrect);
                //Congratulate user if their guess matches what the computer hid
                if ((positionsCorrect == 3) && (coloursCorrect == 3)) {
                    System.out.println("Congratulations. You have guessed correctly.");
                    tryAgain = 2;
                }
                //Let the user try again or skip
                if (tryAgain == 1) {
                    System.out.println("\nEnter 1 to try again. Enter any other number to skip and to start a new game.");
                    tryAgain = Integer.parseInt(br.readLine());//user decides to try again
                }
            } while (tryAgain == 1);
             //Display the computer's choices (what the computer hid)
             System.out.println("Computer actually  hid: " + compChoice1 + " " + compChoice2 + " " + compChoice3);
            //Let the user start a new game
            System.out.println("\nEnter 2 to start a new game.");
            newGame = Integer.parseInt(br.readLine());//user decides to try again
        } while (newGame == 2);
    }

    public static void checkColoursCorrect() {
        //Initialize amd declare variables 
        int totalCompR=0, totalChoiceR=0, totalCompG=0, totalChoiceG=0, totalCompB=0, totalChoiceB=0, totalCompY=0, totalChoiceY=0;
        int totalR, totalG, totalB, totalY;
        coloursCorrect = 0;
        
        //Find how many of each letter are in the computer's choice and the user's choice
        for (int i = 0; i < 3; i++) {
            if (compChoices[i].compareToIgnoreCase("R") == 0) {
                totalCompR = totalCompR + 1;
            }
            if (choices[i].compareToIgnoreCase("R") == 0) {
                totalChoiceR = totalChoiceR + 1;
            }
            if (compChoices[i].compareToIgnoreCase("G") == 0) {
                totalCompG = totalCompG + 1;
            }
            if (choices[i].compareToIgnoreCase("G") == 0) {
                totalChoiceG = totalChoiceG + 1;
            }
            if (compChoices[i].compareToIgnoreCase("B") == 0) {
                totalCompB = totalCompB + 1;
            }
            if (choices[i].compareToIgnoreCase("B") == 0) {
                totalChoiceB = totalChoiceB + 1;
            }
            if (compChoices[i].compareToIgnoreCase("Y") == 0) {
                totalCompY = totalCompY + 1;
            }
            if (choices[i].compareToIgnoreCase("Y") == 0) {
                totalChoiceY = totalChoiceY + 1;
            }
        }
        //Compare the number of each letter in the user's guess and the computer's choice and decide the total number of similar letters
        if (totalCompR >= totalChoiceR) {
            totalR = totalChoiceR;
        } else {
            totalR = totalCompR;
        }
        if (totalCompG >= totalChoiceG) {
            totalG = totalChoiceG;
        } else {
            totalG = totalCompG;
        }
        if (totalCompB >= totalChoiceB) {
            totalB = totalChoiceB;
        } else {
            totalB = totalCompB;
        }
        if (totalCompY >= totalChoiceY) {
            totalY = totalChoiceY;
        } else {
            totalY = totalCompY;
        }
        //Calculate the total number of correct colours
        coloursCorrect = totalR + totalG + totalB + totalY;
    }

    public static void checkPositionsCorrect() {
        //Initialize variable
        positionsCorrect = 0;
        //Find whether the computers first choice is equivalent to the users first choice and etc. for each choice
        for (int i = 0; i < 3; i++) {
            if ((choices[i].compareToIgnoreCase(compChoices[i]) == 0)) {
                positionsCorrect = positionsCorrect + 1;
            }
        }
    }

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


