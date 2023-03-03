/**
 * Class: Exercise 1
 * @author: Jaylan Igbinoba
 * @Course: ITEC 2140 Spring 2023
 * @verison: 1.0
 * @Written: March 14, 2023
 * @Description: This Code tries to display the 30th number of the Fibonacci Series.
 */

public class Exercise4 {
    public static void main(String[] args){

    int b = 0;
    int a = 1;
    int sum = 0;
        System.out.print(b);
        //These are the initial inputs for the variables. I needed to output b 1st to have the 0 value go 1st.

    while( sum <= 317811 ){
        sum = a + b;
        a = b;
        b = sum;
        System.out.print( "," + sum);
    //This above is the while loop that will keep out putting numbers until the 29 number is reached
        //then it will output the 30th number we need.




    }



    }
}
