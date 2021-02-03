import java.util.Scanner;

/**
 * Program ask for your birthday via birth month by number, their date and the year.
 * output will look like: You were born on Sept. 7, 1959
 *
 *Andrew Dameron
 * 12/13/11
 */
public class Midsemester
{ public static void main(String[] args) {
    final int January = 1, February = 2, March = 3, April = 4, May = 5, June = 6, July = 7, August = 8, September = 9, October = 10, November = 11, December = 12;
    int Month;
    int Day;
    int Year;
    int TotalYear;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter Your Birth Month by number(1=Jan, 2=Feb. etc.),");
    System.out.println("The day you were born on, and the year you were born on");
    System.out.print("Birth Month: ");
    Month = input.nextInt();
    System.out.print("Day: ");
    Day = input.nextInt();
    System.out.print("Year: ");
    Year = input.nextInt();
       
      System.out.print("You were Born on:");
         if (Day > 31) {
        System.out.print(" Day Error, please enter correct day");
    } if (Month > 12) {
        System.out.print(" Month Error, please enter correct month");      
   } System.out.print("You were Born on: ");
   switch (+ Month) {
        case January: System.out.print("January"); break;
        case February: System.out.print("February"); break;
        case March: System.out.print("March"); break;
        case April: System.out.print("April"); break;
        case May: System.out.print("May"); break;
        case June: System.out.print("June"); break;
        case July: System.out.print("July"); break;
        case August: System.out.print("August"); break;
        case September: System.out.print("September"); break;
        case October: System.out.print("October"); break;
        case November: System.out.print("November"); break;
        case December: System.out.print("December"); break;
    } 
  System.out.println(" " + Day +"," + " " + Year);
    TotalYear = 2012 - Year;
    if (TotalYear <= 12){
        System.out.print(" You are a child!");
    }if ( TotalYear >= 13 && TotalYear <= 18){
        System.out.print(" You are a teen!");
    } if (TotalYear >= 19 && TotalYear <= 39){
        System.out.print(" You are a young adult!");
    }if (TotalYear >= 40) {
        System.out.print("You are old!");
    }   
   }
}
