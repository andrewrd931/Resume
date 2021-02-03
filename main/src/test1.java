import java.util.Scanner;
/**
 * Write a description of class test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test1
{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int data;
      double output;
      
      System.out.println("Hello, enter number here: ");
      data = input.nextInt();
      
      
      output = data * 10 - 30 + 25;
      System.out.println("here is the output: " + output);
     
      test2 spot1 = new test2();
     
      spot1.find(output);
      
      
      System.out.print("Useless information, here is one more: " + output);
    }
    
}
