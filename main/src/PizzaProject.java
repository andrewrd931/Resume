import java.util.Scanner;
/**
 * Scanner for pizza making
 * 
 * Andrew Dameron
 * 11/15/11
 */
public class pizzaProject {
    public static void main(String[] args){
        double doubleLabor = .75;
        double doubleRent = 1.00;
        double doubleMaterials = 0.05;
        double doubleResults;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How big do you want the pizza in inches: ");
        doubleMaterials *= input.nextDouble();
        
        doubleResults = doubleLabor + doubleRent + doubleMaterials;
        System.out.println("The Cost of making pizza is:$ " +doubleResults);
    }
}
  