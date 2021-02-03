import java.util.Scanner;
/**
 * Abstract class TestCircle - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class TestObjects
{
   public static void main(String[] args) {
       /**
        * calls circle object.
        * finds width and length for rectangle
        * returns width and length to class rectangle
        * calls rectangle object
        */
       Circle spot1 = new Circle();
       Scanner input = new Scanner(System.in);
       System.out.println("What is the length of your rectangle?");
       int length = input.nextInt();
       System.out.println("What is the width of your rectangle?");
       int width = input.nextInt();
       NewRectangle spot2 = new NewRectangle(length, width);
       
       /**
        * calls classes to main
        */
       spot1.setRadius(5);
       spot2.perimeter();
       spot2.area();
       
       /**
        * pre: all objects must be found
        * post: will display circle: radius and circumference. rectangle: perimeter and area.
        */
       System.out.println("Circle radius: " + spot1.getRadius());
       System.out.println("Circle circumference: " + spot1.Circumference());
       System.out.println("Rectanlge perimeter: " + spot2.perimeter());
       System.out.println("Rectangle area: " + spot2.area());
    }
}
