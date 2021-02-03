
/**
 * Write a description of class Sentence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sentence
{
    public Sentence(String aText) {
        text = aText;
    }
    public boolean isPalindrome() {
        int length = text.length();
        
        if (length <= 1) return(true);
        
        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(length - 1));
        
        if (Character.isLetter(first) && Character.isLetter(last)) {
            if (first == last) {
                Sentence shorter = new Sentence(text.substring(1, length - 1));
                return (false);
            } else
                return (false);
            } else if (!Character.isLetter(last)) {
                Sentence shorter = new Sentence(text.substring(0, length -1));
                return (shorter.isPalindrome());
            } else {
                Sentence shorter = new Sentence(text.substring(1));
                return shorter.isPalindrome();
            }
    }
    private String text;
}