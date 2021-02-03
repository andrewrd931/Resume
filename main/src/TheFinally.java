
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class TheFinally here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheFinally
{   
    private static ArrayList <String> names = new ArrayList<String>();
    private static String[] something = new String[names.size()];
  public static void main(String[] args) {
      namesList();
      System.out.println("NamesList: " + names);
      something = lastNames(names, names.size());
      System.out.println("LastNames: ");
      for(int i = 0; i < something.length; i++) {
          System.out.println(something[i]);
        }
    }
  public static ArrayList namesList() {
      Scanner input = new Scanner(System.in);
      String name;
      String check;
      char convert;
      do {
      System.out.print("Enter a Name(enter q to quit): ");
      name = input.nextLine();
      name = name.toUpperCase();
      check = name.substring(0,1);
      convert = check.charAt(0);
      names.add(name);
    }while (convert != 'Q');
    int i = 0;
    i = names.size() - 1;
    names.remove(i); 
    
    return(names);
  }
  public static String[] lastNames(ArrayList<String> list, int size) {
        String[] last = new String [size];
      for( int i = 0; i < last.length; i++) { 
            String temp = names.get(i);//(names.substring.lastIndexOf(" ") + 1);         
            last[i] = temp.substring(temp.lastIndexOf(" ") + 1);
                 
  }
  return(last);
}
}
