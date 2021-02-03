
import java.util.Scanner;
/**
 * piggy bank program
 * 
 * Andrew dameron
 * 3/19/12
 */
public class mySavings
{
    private static double tBalance = 0;
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int choice;
     
     piggyBank spot1 = new piggyBank(tBalance);
     do {
     System.out.println("1. Show total in bank");
     System.out.println("2. Add a penny");
     System.out.println("3. Add a nickel");
     System.out.println("4. Add a dime");
     System.out.println("5. Add a quarter");
     System.out.println("6. Take money out of bank");
     System.out.println("Enter 0 to quit");
     System.out.print("Enter your choice: ");
     choice = input.nextInt();
     if(choice == 1) {
         System.out.println("Your current balance: " + spot1.deposit(.0));
        } else if(choice == 2) {
            System.out.println("Your current balance: " + spot1.deposit(.01));
        }else if(choice == 3) {
            System.out.println("Your current balance: " + spot1.deposit(.05));
        }else if(choice == 4) {
            System.out.println("Your current balance: " + spot1.deposit(.10));
        }else if(choice == 5) {
            System.out.println("Your current balance: " + spot1.deposit(.25));
        }else if(choice == 6) {
            System.out.print("How much would you like to withdrawl: ");
            double withdrawl = input.nextDouble();
            System.out.println("Your current balance: " + spot1.withdrawl(withdrawl));
        }else {
        }

     } while (choice != 0);
   }
 }
