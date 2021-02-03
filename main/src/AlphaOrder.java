import java.util.Scanner;
/**
 * Write a description of class AlphaOrder here.
 * 
 * Andrew Dameron
 * @version (a version number or a date)
 */
public class AlphaOrder{   
public static void main(String[] args) {  
    String word1, word2, temp;
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a word: ");
    word1 = input.nextLine();
    System.out.print("Enter a second word: ");
    word2 = input.nextLine();
    input.close();
    
    if (word1.compareToIgnoreCase (word2) == 0) {
        System.out.println("Words are equal.");
    } else if (word1.compareToIgnoreCase(word2) > 0) {
        temp = word1;
        word1 = word2;
        word2 = temp;
        System.out.println("In alphabetical order: " + word1 +" " + word2);
    } else {
        temp = word2;
        word2 = word1;
        word1 = temp;
        System.out.println("In alphabetical order: " + word2 + " " + word1);
        
        
    }
  }
}
