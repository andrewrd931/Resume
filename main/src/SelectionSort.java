import java.util.ArrayList;
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort
{
    public static void give(int[] array) {
        int[] originalArray;
        int[] sortedArray;
       originalArray = array;
       sort(originalArray);
       sortedArray = originalArray;
    }
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static void sort(int[] items) {
        for (int index = 0; index < items.length; index++) {
            for (int subIndex = index; subIndex < items.length; subIndex++) {
                if (items[subIndex] < items[index]) {
                int temp = items[index];
                items[index] = items[subIndex];
                items[subIndex] = temp;
              }
          }
      }
    }
    private static void findLowest() {
        
    }
}
