
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class SortedArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedArray
{
    public static void main(String[] args) 
    { 
        int[] myNums;
        int test;
        SelectionSort sortedArray;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        test = input.nextInt();
        
        myNums = new int[test];
        for (int i = 0; i < myNums.length; i++) {
            myNums[i] = (int)(101 * Math.random());
        }
        
        System.out.println("Original: ");
        displayArray(myNums);
        
        SelectionSort.give(myNums);
        
        System.out.println("Sorted: ");
        displayArray(myNums);
    }
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
