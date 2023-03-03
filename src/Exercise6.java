/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 28, 2023
 * @Description: This code tries to output the sum of the inputted digits
 */

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {

        int value = 0;
    //This code gives the user input
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a Integer!: ");
        value = input.nextInt();

        int sum = 0;
        int i = 1;
    // Below is the loop that separates the digits and adds them one by one
        while( i > 0 ){

            int number = value % 10;
            sum += number;
            i = value / 10;
            value = i;
        }
    // This outputs the sum
        System.out.println("Sum of digits added together is: " +  sum);

    }



}
