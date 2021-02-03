
import java.util.Scanner;
/**
 * Write a description of class GoingDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoingDown
{  
    private static int totalInt;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        DownGradeNumber(number);
    }
    public static int DownGradeNumber(int number) {
        int newNum; 
             if (number > 0) {
                totalInt += number;
                newNum = number - 1;
                System.out.println(newNum);
                DownGradeNumber(newNum);
           } else {
                System.out.println("Total number is: " + totalInt);
                return(0);
            }
        return(0);
    }
}
