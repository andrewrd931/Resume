
/**
 * Write a description of class recursionTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursionTest
{
    public static void main(String[] args) {
        showRecursion(2);
    }
    public static void showRecursion(int num) {
        System.out.println("Entering method. num = " + num);
        if (num > 1) {
            showRecursion(num-1);
        }
        System.out.println("Leaving method. num = " + num);
    }
}
