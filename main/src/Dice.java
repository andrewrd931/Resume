import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dice
{   public static void main(String[] args) {
        int[] outcomes = new int[13];
        Scanner input = new Scanner(System.in);
        int numRolls;
        int outcome;
        
        System.out.print("how many rolls? ");
        numRolls = input.nextInt();
        
        for(int roll = 0; roll < numRolls; roll++) {
            outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
            outcomes[outcome] += 1;
        }
        
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + ": " + outcomes[i]);
        }
    }
}
