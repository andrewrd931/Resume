import javax.swing.JFrame;
import java.util.Scanner;
/**
 * Write a description of class Emptybox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EmptyFrameViewer
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
      JFrame frame = new JFrame();


      frame.setSize(400, 300);
      frame.setTitle("IM GONNA DESTROY YOU");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      MyFace2 component = new MyFace2();
      frame.add(component);
      
      String word;
      frame.setVisible(true);
      do{
          
      System.out.println("Enter Something: ");
       word = input.next();
    }while(word.equalsIgnoreCase("hello") == false);
   }
}
