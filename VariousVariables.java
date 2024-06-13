// Author: Eric Sensebaugh
// Exercise 8 Program that asks users for diffrent types of input including integers and floats. The users input is then output in a summary. First time using variables other than strings.
public class VariousVariables {

    public static void main(String[] args) {
        

        int numberOfChicken = 9000;
        double baconWeight = 0.1;
        String tractor = "Zetor";

        // DON'T MODIFY THESE:
        System.out.println("Chicken:");
        System.out.println(numberOfChicken);
        System.out.println("Bacon (kg):");
        System.out.println(baconWeight);
        System.out.println("Tractor:");
        System.out.println(tractor);
        System.out.println("");
        System.out.println("And finally, a summary:");
        System.out.println(numberOfChicken);
        System.out.println(baconWeight);
        System.out.println(tractor);
    }
}