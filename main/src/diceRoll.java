
/**
 * Random number generator
 * 
 * Andrew Dameron 
 * november 30, 2011
 */
public class diceRoll
{
    public static void main(String[] args) {
    int Result1 = (int)(6 * Math.random() + 1);
    System.out.println("First dice roll: " + Result1);
    int Result2 = (int)(6 * Math.random() + 1);
    System.out.println("Second dice roll: " + Result2);
    if (Result1 == 3 && Result2 == 4) {
        System.out.println("You won with a 7!");
    } else if (Result1 == 4 && Result2 == 3){
        System.out.println("You won with a 7!");
    } else if (Result1 == 5 && Result2 == 6){
        System.out.println("You won with a 11!");
    } else if (Result1 == 6 && Result2 == 5){
        System.out.println("You won with a 11!");
    } else if (Result1 == 6 && Result2 == 6) {
        System.out.println("You won with box cars!");
    } else if (Result1 == Result2){
        System.out.println("You won with a match!");
    } else { System.out.println("Sorry, You lost the game");
  }
 }
}