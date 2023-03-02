/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to to display the user's max and min grades they had put in
 */

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades (type a letter to stop inputting grades): ");
         int max = 0;
         int min = 0;
         int grades = 0;
         int count = 0;



         while(input.hasNextInt()){
             grades = input.nextInt();
             if (grades > max){
                 max = grades;

             }
             if(min == 0){
                 min = 1 * grades;
             }

             if(grades < min){
                 min = grades;
             }

         }

        System.out.println("The max grade is: " + max);
        System.out.println("the min grade is: "+ min);
    }
}
