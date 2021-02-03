
import java.util.Scanner;
/**
 * Write a description of class AVGLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AVGLoop {
  public static void main(String[] args) {
    int num;
    System.out.print("Enter the Starting number: ");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
      for (; num <= 10; num++) {
        System.out.println(num);
    }
  }
}
