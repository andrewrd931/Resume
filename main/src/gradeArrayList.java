
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Grade Average project 2/2.
 * 
 * Andrew Dameron
 * 1/03/12
 */
public class gradeArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int newGrade = 0;
        int grade = 0;
        ArrayList<Integer> myInt = new ArrayList<Integer>();
        int index = 0;
        int lastInteger;
        int average = 0;
       do{
            if (grade != -1) {
            System.out.print("enter grade(-1 to quit): ");
            grade = input.nextInt();
            myInt.add(grade);
        }
        } while (grade != -1);
       lastInteger = myInt.indexOf(-1);
       myInt.remove(lastInteger);
       
       
       index = lastInteger - 1;
       for (int i = 0; i <= index; i++) {
           grade += myInt.get(i);
        }
          average = grade / myInt.size();
          double newAverage = (double)average;
        // for (Integer name : myInt) {
        System.out.println("your grade average is: " + newAverage);
        // }
    }
}