// Author: Eric Sensebaugh
// Exercise 12 program that asks the user for three numbers. Prints the three numbers that the user input, sums the numbers and prints the sum.
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int FirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int SecondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int ThirdNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (FirstNumber + SecondNumber + ThirdNumber));

    }
}
