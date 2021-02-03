
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
   public Triangle(int aWidth) {
       width = aWidth;
   }
   public int getArea() {
       if (width == 1) return(1);
           Triangle smallerTriangle = new Triangle(width - 1);
           int smallerArea = smallerTriangle.getArea();
           return (smallerArea + width);
   }
   private int width;
}
