/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardtime;

/**
 * Name: Saahibdeep Dhaliwal 
 * Course Code: ICS 3U1 
 * Teacher: Mr. Wilkes
 * Date:October 14, 2020 
 * Program Description: This program uses methods to paint 
 */

//Import toolkits
import java.io.*;

public class Main 
{
    static String amPM;//will hold am/pm for standard time 
    static String traditionalTime;//will store traditional time from user
    static int mins1, mins2,hours;//will store hours and minutes
   
    
    public static void main (String args []) throws IOException {
 BufferedReader br = new BufferedReader (new InputStreamReader (System.in));// user input

 

    int tryAgain=1;//will initial do-while loop
    System.out.println("Standard Time to Traditional Time Converter");
    System.out.println("===========================================");
    do{
    System.out.println();
    System.out.println("Input a time in Standard Form (HH:MM:SS):");
    String standardTime=br.readLine();//user inputs time in standard form
    System.out.println();
    
    
    
    do{
    if ((standardTime.length())!=8){
    System.out.println("Invalid time entered.");
    System.out.println("Input a time in Standard Form that has this form HH:MM:SS ...");
    standardTime=br.readLine();//user inputs time in standard form
    System.out.println();
    }
    }while((standardTime.length())!=8);
    
    convertToTraditional(standardTime);
    
    System.out.println(standardTime+" is equivalent to "+traditionalTime);
    System.out.println();
    System.out.println("Enter 1 to try again.");
    tryAgain=Integer.parseInt(br.readLine());//user decides to try again
    }while
            (tryAgain==1);//will repeat if user enters 1
    
    }//closes main body

    public static void convertToTraditional(String standardTime) {
        //Assign values to the variables
        hours = Integer.parseInt(standardTime.substring(0, 2));
        mins1 = Integer.parseInt(standardTime.substring(3,4));
        mins2 = Integer.parseInt(standardTime.substring(4,5));
        //Declare and assign a variable for seconds 
        int sec = Integer.parseInt(standardTime.substring(6,8));

        //Assign a value for traditional time based on all of the possible cases for the user's input
        if ((hours > 12) && (hours<24) && (mins1<6)) {
            traditionalTime = (hours - 12 + ":" + mins1+ mins2 + " PM");
        } else if (hours == 12 && (mins1<6)) {
            traditionalTime = (hours + ":" + mins1+ mins2 + " PM");
        } else if ((hours < 12) && (hours >0)&& (mins1<6)){
            traditionalTime = (hours + ":" + mins1 + mins2 + " AM");
        } else if ((hours == 0) && (mins1<6)) {
            traditionalTime = (hours + 12 + ":" + mins1 + mins2 + " AM");
        } else if ((hours == 24) &&(mins1==0) && (mins2==0) && (sec==0)) {
            traditionalTime = (hours - 12 + ":" + mins1 +mins2 + " AM");
        }
        else traditionalTime = "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\bERROR! The time you entered is invalid.";
    }
}
