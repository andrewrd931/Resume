/**
 * Write a description of class Debugging here.
 * 
 * Andrew Dameron   
 * 1/03/12
 */
public class Debugging
{
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        while (num1 < 10) {
            if (num1 % 3 == 0) {
                num2 += num1;
                System.out.print(num2 + " ");
            }
            num1 += 1;
        }
    }
}
