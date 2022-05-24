package Practice;

import java.util.Scanner;


public class UserInterface {
    private final WordSet wordsArr;
    private final Scanner scanner;
    public UserInterface(WordSet wordsArr, Scanner scanner) {
        this.scanner = scanner;
        this.wordsArr = wordsArr;
    }
    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String wordInput = scanner.nextLine();

            if (this.wordsArr.contains(wordInput)) {
                break;
            }
            // adding the word to the list of previous words
            this.wordsArr.add(wordInput);
        }

        System.out.println("You gave the same word twice!");

        }
    }

//    public boolean alreadyEntered(String pWord) {
//        if(wordsArr.contains(pWord)){
//            return true;
//        }
//        return false;
//    }
