// Author: Eric Sensebaugh
// Exercise 18 Practice using conditional statements.  Program that takes a users input integer checks to see if its over 120 and if so prints "Speeding ticket!".
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        
       if (speed > 120){
           System.out.println("Speeding ticket");
       }
       
    }
}