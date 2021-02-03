

import java.util.Scanner;
/**
 * Write a description of class AveVal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AveValue
{
    public static void main(String[] args) {
        final int SENTINEL = 0;
        int newValue;
        int numValues = 0;
        int sumOfValues = 0;
        double avg;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculate Average Program");
        System.out.println("Enter a value(" + SENTINEL + " to quit): ");
        newValue = input.nextInt();
        while (newValue != SENTINEL) {
            numValues += 1;
            sumOfValues += newValue;
            System.out.print("Enter a value(" + SENTINEL + " to quit: ");
            newValue = input.nextInt();
        }
        input.close();
        
        avg = (double)sumOfValues / (double)numValues;
        System.out.println("Average is " + avg);
        
    }
}
