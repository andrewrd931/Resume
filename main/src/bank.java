import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class bank {
       
       public static void main(String[] args) {
           Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
           
           Scanner input = new Scanner(System.in);
           double data;
           NumberFormat money = NumberFormat.getCurrencyInstance();
           
           System.out.println(munozAccount);
           
           System.out.print("Enter deposit amount: ");
           data = input.nextDouble();
           munozAccount.deposit(data);
           System.out.println("Balance is: " +money.format(munozAccount.getBalance()));
           
           System.out.print("Enter withdrawal amount: ");
           data = input.nextDouble();
           munozAccount.withdrawal(data);
           System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
                                            
           }
        }
