//Author: Eric Sensebaugh
// Exercise 22 Program that takes a users number as an input and determines if it is a odd or even number
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int userNumber = Integer.valueOf(scan.nextLine());
        
        if (userNumber % 2 == 0){
            System.out.println("Number " + userNumber + " is even");
        } else{
            System.out.println("Number " + userNumber + " is odd");
            
        }

        
    }
}