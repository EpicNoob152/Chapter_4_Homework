/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to reverse the user inputted String.
 */

import java.util.Scanner;
public class Exercise8 {
    //This is the code to give the user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word1 = input.nextLine();
// We will need to use the char later in the loop and the word2 is empty for now
        char reversed;
        String word2 = " ";

// Loop for to reverse the user inputted string
    for (int i = 0; i < word1.length(); i++){

        reversed = word1.charAt(i);
        word2 = reversed + word2;
    }
    //Output for the reversed word.
        System.out.println("Reverse of " + word1 + " is " + word2);
    }
}
