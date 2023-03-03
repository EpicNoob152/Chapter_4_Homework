/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 28, 2023
 * @Description: This code tries to output the factorial of the inputted number.
 */
import java.util.Scanner;
public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //Initial values of the product and i values before they get changed.
        int number = input.nextInt();
        int product = 1;
        int i = 1;

        //Below is the code that times all the numbers that lead up to the user inputted number.
        while(i <= number ){

            product *= i;
            i++;

        }
        //This prints the factorial.
        System.out.println(number + "!" + " is: " + product);
    }

}
