
import java.util.Scanner;
/**
 * Grade Average project 2/2.
 * 
 * Andrew Dameron
 * 1/03/12
 */
public class grade {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        int newGrade;
        int numGrade = 0;
        int sumOfGrade = 0;
        double avg;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculate Grade Program");
        System.out.print("Enter a Grade(" + SENTINEL + " to quit): ");
        newGrade = input.nextInt();
        while (newGrade != SENTINEL) {
            numGrade += 1;
            sumOfGrade += newGrade;
            System.out.print("Enter a Grade(" + SENTINEL + " to quit): ");
            newGrade = input.nextInt();
        }
        input.close();
        
        avg = (double)sumOfGrade / (double)numGrade;
        System.out.println("Average is " + avg);
        
            
    }
}
