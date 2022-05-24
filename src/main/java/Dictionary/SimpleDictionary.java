package Dictionary;
import java.util.HashMap;
public class SimpleDictionary {
    private final HashMap<String, String> translation;

    public SimpleDictionary(){this.translation= new HashMap<String, String>();}
    public void add(String word, String pTranslation){
        translation.put( word,  pTranslation);
        System.out.println();
    }

    public String translate(String word){
        return this.translation.getOrDefault(word, "Word " + word + " was not found.");
    }



}
