
import java.util.Scanner;
/**
 * intArrayChallenge
 * 
 * Andrew dameron
 * 4/8/12
 */
public class integerArrayWorker
{
    private int[][] intArray = new int[2][3];
    public static void main(String[] args) {
        integerArrayWorker worker = new integerArrayWorker();
        String[][] puzzle = new String[3][4];
        worker.print();
        int[][] puzzle2 = {{1,2,3}, {4,5,6}};
        worker.setIntArray(puzzle2);
        worker.print();
        worker.colSum();
        
    }
    public void setIntArray(int[][] numArray) {
        intArray = numArray;
    }
    public void print() {
        System.out.println();
        int value = 0;
        for (int row = 0; row < intArray.length; row++) {
            for (int col = 0; col < intArray[0].length; col++){
                System.out.print(intArray[row][col] + " ");
                value += intArray[row][col];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The total value is: " + value);
    }
    public void colSum() {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter a column you would like to sum, 0, 1, or 2.");
        int column = in.nextInt();
        int sum = 0;
        for (int row = 0; row < intArray.length; row++) 
        {
            sum += intArray[row][column];
        }
        System.out.println("Array sum: " + sum); 
    }
}
