import java.util.Scanner;
public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int product = 0;
        i = 0;
        while(i <= number ){
            i++;
            product *= i;


        }
        System.out.println(product + "!");
    }

}
