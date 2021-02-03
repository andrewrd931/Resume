
/**
 * Write a description of class recursionTest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursionTest2 {   
    public static void main(String[] args) {
        int x = intPower(2, 5);
        System.out.println(x);
    }
    public static int intPower(int num, int power) {
        int result;
        if (power == 0) {
            result = 1;
        } else {
            result = num * intPower(num, power-1);
        }
        return(result);
    }
}
