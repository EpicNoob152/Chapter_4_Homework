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

        int grades = 1;
        int i = 0;
        int count = 0;

        while(grades != 9999){
            System.out.println("Enter in your grades (Type the numbers 9999 to stop):  ");
            grades = input.nextInt();
            if (grades == 9999){
                break;
            }
          else{
                i++;
                count += grades;
            }
        }

        int mean = count / i;
        System.out.println("your grade is: " + mean);
    }
}
