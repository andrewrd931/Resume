import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class TheGuessingGame here.
 * 
 * Andrew Dameron   
 * 1/6/12
 * Algorithm 1
 */
public class TheGuessingGame2
{
    public static void main(String[] args) {
        int secretNumber = (int) (20 * Math.random() + 1);
        int playerGuess;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pick a number between 1 and 20: ");
        playerGuess = input.nextInt();
        
        do {
        if (playerGuess == secretNumber) {
            System.out.println("You guessed right!!");
        } else  if (playerGuess != secretNumber) {
            System.out.print("Try again!: ");
            playerGuess = input.nextInt();       
        }
        } while (playerGuess != secretNumber) ; 
        if (playerGuess == secretNumber) {
            System.out.print("You guess right!!");
        }
    }
}