/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to find the index for the inputted string
 */

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //These lines of code are supposed to be used to get a word and character from the user
        System.out.println("Enter a String: ");
        String word1 = input.nextLine();


        System.out.println("Enter a character (Just one please!): ");
        String word2 = input.nextLine();

        // I used the last index to find the last character in the string in word1
        System.out.println("Last occurrence of character "+ word2 + " in " + word1 + " is in index " + word1.lastIndexOf(word2));

    }
}
