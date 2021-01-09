/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

/**
 * Program Description: This program lets the answer several trivia
 * questions by inputting numbers into a dialog box and based on the user's 
 * input the program outputs a message
 */

//Import toolkits
import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare and assign variables for rules and question 1
        String rules = JOptionPane.showInputDialog("Here are the rules for the \"Game of Thrones\" Trivia:"
                + "\n1. Answer each question honestly. \n2. Chose an answer by inputting the corresponding number from 1 to 5. "
                + "\n Type any key and click \"OK\" to acknowledge the rules and move on.");
        String question1 = JOptionPane.showInputDialog("Who is a child of the Stark family? "
                + "\n1. Robb \n2. Daenerys \n3. Tyrion \n4. Ramsay \n5. Theon");
        byte answer1 = Byte.parseByte(question1);
        
        //Select outputs for question 1
        if (answer1 == 1) {
            System.out.println("Question 1: Correct, Robb is the eldest child in the Stark family.");
        } else if (answer1 == 2) {
            System.out.println("Question 1: Incorrect, Daenerys is the daughter of King Aerys II "
                    + "Targaryen and is the true heir to the throne.");
        } else if (answer1 == 3) {
            System.out.println("Question 1: Incorrect, Tyrion is the youngest child of Lord Tywin Lannister "
                    + "he is a dwarf who is the current Lord of Casterly Rock and Hand of the King.");
        } else if (answer1 == 4) {
            System.out.println("Question 1: Incorrect, Ramsay was the legitmized (as he was born of "
                    + "parents not married to each other) son of Roose Bolton, Lord of the Dreadfort.");
        } else if (answer1 == 5) {
            System.out.println("Question 1: Incorrect, Theon was the youngest son of King Balon Greyjoy, "
                    + "however, the Stark's did treat him like a son.");
        } else {
            System.out.println("Please choose an answer by inputting the coressponding number from 1 to 5.");
        }

        //Declare and assign variables for question 2
        String question2 = JOptionPane.showInputDialog("Who was responsible for the creation of the Night King? "
                + "\n1. The Lord of Light \n2. The Drowned God \n3. The Children of the Forest \n4. The First Men \n5. Eddard Stark");
        byte answer2 = Byte.parseByte(question2);
        
        //Select outputs for question 1
        if (answer2 == 1) {
            System.out.println("Question 2: Incorrect, The Lord of Light, R'hllor, is a popular deity throughout the continent of Essos, "
                    + "worshiped extensively in several of the Free Cities.");
        } else if (answer2 == 2) {
            System.out.println("Question 2: Incorrect, The Drowned God, also known as \"He Who Dwells Beneath the Waves\", is a "
                    + "sea deity worshipped by the ironborn of the Iron Islands in Westeros.");
        } else if (answer2 == 3) {
            System.out.println("Question 2: Correct, The Children of the Forest created the White Walkers and the Night King to"
                    + " defend themselves when Westeros was invaded by the First Men.");
        } else if (answer2 == 4) {
            System.out.println("Question 2: Incorrect, The First Men were the original human inhabitants of Westeros. They ruled the continent "
                    + "for thousands of years before the Andals invaded from the eastern continent of Essos.");
        } else if (answer2 == 5) {
            System.out.println("Question 2: Incorrect, Lord Eddard Stark, also known as Ned Stark, was simply the head of House Stark, the Lord of Winterfell, "
                    + "Lord Paramount and Warden of the North, and later Hand of the King to King Robert I Baratheon before he was killed.");
        } else {
            System.out.println("Please choose an answer by inputting the coressponding number from 1 to 5.");
        }
        
        //Declare and assign variables for question 3
        String question3 = JOptionPane.showInputDialog("What is the name of Arya's sword? "
                + "\n1. Ice \n2. Widow's Wail \n3. Longclaw \n4. Lightbringer \n5. Needle");
        byte answer3 = Byte.parseByte(question3);
        
        //Select outputs question 3
        if (answer3 == 1) {
            System.out.println("Question 3: Incorrect, Ice was the name of the Valyrain steel greatsword weilded by Eddard Stark.");
        } else if (answer3 == 2) {
            System.out.println("Question 3: Incorrect, Widow's Wail is the name of one of two Valyrian steel blades made by melting Eddard"
                    + "Stark's sword \"Ice\". It is given by Tywin Lannister as a wedding gift to his grandon King (at the time) Joffrey.");
        } else if (answer3 == 3) {
            System.out.println("Question 3: Incorrect, Longclaw is a Valyrian steel bastard sword that was the ancestral weapon of"
                    + " House Mormont for five centuries. When Lord Jeor Mormont retired from his lordship to take the black and command the Night's Watch, he passed it to Jon Snow");
        } else if (answer3 == 4) {
            System.out.println("Question 3: Incorrect, Lightbringer is a sword of legend, forged and wielded by Azor Ahai, "
                    + "chosen by the Lord of Light to fight the darkness.");
        } else if (answer3 == 5) {
            System.out.println("Question 3: Correct, Needle is a small rapier wielded by Arya Stark. It was given to her by Jon Snow, who had it made by Mikken, "
                    + "the blacksmith of Winterfell.");
        } else {
            System.out.println("Please choose an answer by inputting the coressponding number from 1 to 5.");
        }
        
        //Declare and assign variables for question 4
        String question4 = JOptionPane.showInputDialog("What is the go-to-anaesthetic for maesters across Westeros called? "
                + "\n1. Shade of the Evening \n2. Milk of the poppy \n3. Sourleaf \n4. Tear of Lys \n5. Wolfsbane");
        byte answer4 = Byte.parseByte(question4);
        
        //Select outputs for question 4
        if (answer4 == 1) {
            System.out.println("Question 4: Incorrect, Shade of the evening is a beverage commonly drunk by the warlocks of Qarth. It is the cause for their blue lips. "
                    + "The Warlocks believe that drinking large quantities of shade of the evening grants them magical powers.");
        } else if (answer4 == 2) {
            System.out.println("Question 4: Correct, Milk of the poppy is a powerful medicine, drunk as a liquid, which "
                    + "is used as both a painkiller and an anesthetic.");
        } else if (answer4 == 3) {
            System.out.println("Question 4: Incorrect, Sourleaf is a foul tasting plant that's leaves are chewed in a similar fashion to chewing tobacco.");
        } else if (answer4 == 4) {
            System.out.println("Question 4: Incorrect, The tears of Lys is a rare and costly, but extremely deadly poison. It is clear and tasteless, and thus "
                    + "leaves no trace that might alert the target.");
        } else if (answer4 == 5) {
            System.out.println("Question 4: Incorrect, Wolfsbane is a lethal poison obtained from a plant of the same name. Darts dipped in it may kill a grown man quickly.");
        } else {
            System.out.println("Please choose an answer by inputting the coressponding number from 1 to 5.");
        }
        
        //Declare and assign variables for question 5
        String question5 = JOptionPane.showInputDialog("Which family's crest is a golden lion? "
                + "\n1. House Stark \n2. House Targaryen \n3. House Baratheon \n4. House Lannister \n5. House Tyrell");
        byte answer5 = Byte.parseByte(question5);
        
        //Select outputs for question 5
        if (answer5 == 1) {
            System.out.println("Question 5: Incorrect, the Starks are represented by a grey direwolf.");
        } else if (answer5 == 2) {
            System.out.println("Question 5: Incorrect, house Targaryen is represented by a three-headed dragon.");
        } else if (answer5 == 3) {
            System.out.println("Question 5: Incorrect, house Baratheon is represented by a stag.");
        } else if (answer5 == 4) {
            System.out.println("Question 5: Correct, house Lannister is represented by a golden lion.");
        } else if (answer5 == 5) {
            System.out.println("Question 5: Incorrect, house Tyrell is represented by a rose.");
        } else {
            System.out.println("Please choose an answer by inputting the coressponding number from 1 to 5.");
        }
    }
}
