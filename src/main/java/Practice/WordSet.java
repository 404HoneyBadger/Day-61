package Practice;

import java.util.ArrayList;
public class WordSet {
    private ArrayList<String> wordsArr;

    public WordSet(){
        this.wordsArr = new ArrayList<>();
    }

    public void add(String wordInput){
        this.wordsArr.add(wordInput);
    }

    public boolean contains(String wordInput){
        return this.wordsArr.contains(wordInput);
    }
}
