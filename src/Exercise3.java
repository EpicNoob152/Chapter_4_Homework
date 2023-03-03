/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to display the user's max and min grades they had put in
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
//These are the initial inputs for the max, min and grades, our count value is a special tool we're going to use later
//Below is the loop until the user stops inputting numbers.
         while(input.hasNextInt()){
             grades = input.nextInt();
             if (grades > max){
                 max = grades;
             }//below is our special tool used to prevent the problem of min being stuck on zero unless the user inputs it
             //the count++ will make sure this piece of code is only used once.
             if(min == 0 && count == 0){
                 min = grades;
                 count++;
             }
             if(grades < min){
                 min = grades;
             }
         }
    //this is the printing of the outputs:
        System.out.println("The max grade is: " + max);
        System.out.println("The min grade is: "+ min);
    }
}
