import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 * Write a description of class Gui2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyFace2 extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;

      g2.setColor(Color.BLUE);
      g2.drawString("I'm gonna destroy you", 70, 40);
      
      // Draw the head
      g2.setColor(Color.BLACK);
      Ellipse2D.Double head = new Ellipse2D.Double(50, 60, 150, 180);
      g2.draw(head);

      // Draw the eyes
      g2.setColor(Color.BLUE);
      Rectangle eye = new Rectangle(90, 110, 20, 20);
      g2.fill(eye);
      eye.translate(50, 0);
      g2.fill(eye);

      // Draw the mouth
      Line2D.Double mouth = new Line2D.Double(160, 180, 90, 180);
      g2.setColor(Color.RED);
      g2.draw(mouth);
     
      // Draw the greeting
      g2.setColor(Color.BLUE);
      g2.drawString("In a game of ping-pong", 70, 280);
   }
}
