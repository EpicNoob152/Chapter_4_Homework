

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Give me a Integer!: ");
        int value = input.nextInt();

        int sum = 0;
        int i = 1;

        for( i > 0; value / 10; ){

            int number = value % 10;

            sum += number;

           i = value / 10;

        }

        System.out.println("Sum of digits added together is: ");

    }



}
