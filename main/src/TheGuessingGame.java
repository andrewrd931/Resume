import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class TheGuessingGame here.
 * 
 * Andrew Dameron   
 * 1/6/12
 * Algorithm 1
 */
public class TheGuessingGame
{
    public static void main(String[] args) {
        int secretNumber = (int) (20 * Math.random() + 1);
        int playerGuess;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Guess the Secret number: ");
        playerGuess = input.nextInt();
        
        System.out.println("the secret number is: " + secretNumber);
        
        if (playerGuess == secretNumber) {
            System.out.println("You guessed right!!");
        } else if (playerGuess != secretNumber) {
            System.out.println("You guessed wrong!=(");
       
        }
}
}