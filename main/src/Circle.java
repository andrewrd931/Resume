/**
 * Write a description of class setRadius here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    private static final double PI = 3.14;
    private double radius;
    
    public Circle() {
         radius = 1;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double Circumference() {
        double circleCircumference;
        
        circleCircumference = PI * PI * radius;
        return(circleCircumference);
    }
    public double getRadius() {
        return(radius);
    }
    
}