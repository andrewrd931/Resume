import java.util.Scanner;
/**
 * Write a description of class substrign here.
 * 
 * Andrew Dameron
 * @version (a version number or a date)
 */
public class substring
{   public static void main(String[] args) {
        String output;
        String Greeting = "The quick brown fox jumps over the lazy dog!";
        System.out.println("inputString = " + Greeting);
        String sub = Greeting.substring(0 , 1);
        String sub2 = Greeting.substring(2 , 3);
        String sub3 = Greeting.substring(22 , 23);
        String sub4 = Greeting.substring(23 , 24);
        String sub5 = Greeting.substring(5 , 6);
        String sub6 = Greeting.substring(24 , 25);
        String sub7 = Greeting.substring(3 , 4);
        String sub8 = Greeting.substring(16 , 17);
        String sub9 = Greeting.substring(5 , 6);
        String sub10 = Greeting.substring(42 , 43);
        String sub11 = Greeting.substring(6 , 7);
        String sub12 = Greeting.substring(31 , 32);
        output = sub + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8 + sub9 + sub10 + sub11 + sub12;
        output = output.toUpperCase();
        System.out.print("outpuString = " + output);
      
        
    }
}