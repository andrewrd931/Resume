import java.util.ArrayList;
/**
 * Write a description of class PermutationGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermutationGenerator
{
    public PermutationGenerator(String aWord) {
       word = aWord;
    }
    public ArrayList <String> getPermutations() {
        ArrayList <String> result = new ArrayList<String>();
        
        if(word.length() == 0) {
            result.add(word);
            return(result);
        }
        
        for (int i = 0; i < word.length(); i++) {
            String shorterWord = word.substring(0, i) + word.substring(i + 1);
            PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
            ArrayList <String>  shorterWordPermutations = shorterPermutationGenerator.getPermutations();
            for (String s : shorterWordPermutations) {
                result.add(word.charAt(i) + s);
            }
        }
        return (result);
    }
    private String word;
}

