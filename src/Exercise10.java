/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to input the pattern:
 *
  ******
  *****
  ****
  ***
  **
  *
 *
 *
 *
 *
 */

public class Exercise10 {
    //This loops will produce * until u reach the end of a row then will -1 to the row and keep repeating until it the loop is false.
    public static void main(String[] args) {
        for(int row = 0; row < 6; row++ ){

            for(int column = 1; column <= 6 - row; column++ ){
                System.out.print("*");
            }
            System.out.println();

    }

}
}
