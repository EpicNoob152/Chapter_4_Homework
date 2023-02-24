/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 28, 2023
 * @Description: This Code tries to see if the user input is prime or not.
 */

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a prime number:  ");
        int number = input.nextInt();
        int i;
        for (i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                break;
            }

        }
        if (number % i == 0) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }

    }