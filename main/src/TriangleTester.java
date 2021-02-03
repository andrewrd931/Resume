
/**
 * Write a description of class triangleTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triangleTester
{
   public static void main(String[] args) {
       Triangle t = new Triangle(10);
       int area= t.getArea();
       System.out.println("Area: " + area);
       System.out.println("Expected: 55");
   }
}
