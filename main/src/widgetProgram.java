import java.util.Scanner;
/**
 * This Program finds out how many widgets the user wants and it will reply back what discount the user got and how much it will be for all of the widgets the user wanted.
 * Andrew Dameron
 *  9/25/12
 */ 
public class widgetProgram
{
public static void main(String[] args) {
   Scanner input = new Scanner(System.in); // declares scanner
   int number; // sets up variable number
   double widget = .95; // sets up widget and declares how much the widget is
   double widget2; // sets upthe variable widget2
   System.out.println("Buy 5000, 10000, 15000, 20000, or 50000"); 
   System.out.print("Enter how many widgets you would like to purchase: ");
   number = input.nextInt(); // recieves user's input on how many widgets they want to buy and sets it to the variable number
   
   if(number <= 10000){ // if number of widgets is lesser than 10000
       System.out.println("No discount gained"); // tells user they gained no discount
       widget2 = widget * number; // multiplies the price of the widget by the number of widgets wanting to buy. sets answer to widget2
       System.out.print("You spent: " + widget2); // displays the cost of all the widgets will be, excludes discount
       System.out.print(" ");
       System.out.println("dollars");
   } else if(number <= 20000){ // if number of widgets is lesser than 20000
       System.out.println("You gained a 5 cent discount per widget"); // tells user they gained a 5 cent discount
       widget2 = (widget - .05) * number; // multiplies the price of the widget subtracted by the discount  by the number of widgets wanting to buy. sets answer to widget2
       System.out.print("You spent: " + widget2); // displays the cost of all the widgets will be, includes discount
       System.out.print(" ");
       System.out.println("dollars");
   }  else if(number <= 50000) { // if number of widgets is lesser than 50000
       System.out.println("You have gained a 10 cent discount per widget"); // tells user they gained 10 cent discount
       widget2 = (widget - .10) * number; // multiplies the price of the widget subtracted by the discount  by the number of widgets wanting to buy. sets answer to widget2
       System.out.print("You spent: " + widget2); // displays the cost of all the widgets will be, includes discount
       System.out.print(" ");
       System.out.println("dollars");
   } else { // if number of widgets is greater than 50000
       System.out.println("You have gained a 20 cent discount"); // tells user they gained 20 cent discount
       widget2 = (widget - .20) * number; // multiplies the price of the widget subtracted by the discount by the number of widgets wanting to buy. sets answer to widget2
       System.out.print("You spent: " + widget2); // displays the cost of all the widgets will be, includes discount
       System.out.print(" ");
       System.out.println("dollars");
       
   }
}
}