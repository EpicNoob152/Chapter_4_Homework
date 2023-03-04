/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to get the user to input 2 strings. Then those Strings will be checked to see which string is longer
 * and which string comes 1st in alphabetical order. After this, it will combine the 2 Strings.
 */

import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 //This is the code for the user to input the 2 string.
        System.out.println("Enter the 1st string ");
        String word1 = input.nextLine();
        System.out.println("Enter the 2nd string ");
        String word2 = input.nextLine();

//This is the code to convert the string into a number to determine if the which string has the longer length
        int len1 = word1.length();
        int len2 = word2.length();
// if-else system to see which string has the longer length
        if(len1 > len2 ){
            System.out.println("String " + word1 + " is longer than String " + word2);
        }
        else if(len1 < len2 ){
            System.out.println("String " + word1 + " is not longer than String " + word2);
        }
        else {
            System.out.println("String " + word1 + " and String " + word2 + " are the same length ");
        }
//This line of code compares if the 1st string is before or after the 2nd string in alphabetical order
        int compare = word1.compareTo(word2);

//This is the if-else system to see if the 1st string is before or after the 2nd string in alphabetical order
        if(compare > 0 ){
            System.out.println("String " + word1 + " appears after String " + word2 + " in alphabetical order.");
        }
        else if(compare < 0 ){
            System.out.println("String " + word1 + " appears before String " + word2 + " in alphabetical order.");
        }
        else{
            System.out.println("String " + word1 + " and String " + word2 + "  is the same in alphabetical order.");
        }
//The output for the combined words
        System.out.println("New sentence created is: " + word1 + " " + word2);


    }
}
