/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: February 28, 2023
 * @Description: This Code tries to see if the user to calculate the average grade in class
 */

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grades = 1.0;
        int i = 0;
        double count = 0;
        //This is how to input the grades (9999 stops inputting the code) as well as the loop let you keep putting inputs
        while(grades != 9999){
            System.out.println("Enter in your grades (Type the numbers 9999 to stop):  ");
            grades = input.nextDouble();
            if (grades == 9999){
                break;
            }
          else{
                i++;
                count += grades;
            }
        }
        //This is the mean calculation and the output of the mean
        double mean = count / i;
        System.out.println("your grade is: " + mean);
    }
}
