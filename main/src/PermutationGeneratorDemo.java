
import java.util.ArrayList;
/**
 * Write a description of class PermutationGeneratorDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermutationGeneratorDemo
{
    public static void main(String[] args) {
        
        PermutationGenerator generator = new PermutationGenerator("eat");
        ArrayList<String> permutations = generator.getPermutations();
        for (String s : permutations)
        { 
            System.out.println(s);
        }
    }
}
