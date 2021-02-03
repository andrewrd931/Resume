import java.util.Scanner;
/**
 * Write a description of class NewRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewRectangle
{   
    private double newLength;
    private double newWidth;
   /**
    * constructor
    * pre: length2 and width2 must be entered
    * post: newWidth and newLength must equal length2 and width2.
    */
    public NewRectangle(int length2, int width2) {
    newLength = length2;
    newWidth = width2;
   }
   /**
    * calculates the rectangle's perimeter
    * pre: newLength = length2, newWidth = width2
    * post: return perimeter to main
    */
   public double perimeter() {
       double newRectanglePerimeter;
       
       newRectanglePerimeter = (newLength + newLength) + (newWidth + newWidth);
       return(newRectanglePerimeter);
   }
   /** 
    * calculates the rectangle's area
    * pre: newLength = length2, newWidth = width2
    * post: returns the area to main
    */
   public double area() {
       double newRectangleArea;
       
       newRectangleArea = newLength * newWidth;
       return(newRectangleArea);
   }

    }
  