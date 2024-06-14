//Author: Eric Sensebaugh
// Exercise 13 Program that asks a user for two integers. The program then uses those numbers and prints them out as an addition formula which the user can view
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int FirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int SecondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(FirstNumber + " + " + SecondNumber + " = " + (FirstNumber + SecondNumber));

    }
}