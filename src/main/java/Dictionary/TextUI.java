package Dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){

        while(true) {
            System.out.print("Command: ");
            String userCommand = scanner.nextLine();
            if (userCommand.equals("end")) {
                System.out.println("ByeBye!");
                break;
            }else if (userCommand.equals("add")){
                System.out.print("Word: ");
                String userCommand1 = scanner.nextLine();
                System.out.print("Translation: ");
                String userCommand2 = scanner.nextLine();
                this.dictionary.add(userCommand1,userCommand2);
                continue;
            }else if(userCommand.equals("search")){
                System.out.print("To be translated: ");
                String userCommand3 = scanner.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(userCommand3));

            }else {
                System.out.println("Unknown Command");
                continue;
            }
        }
    }


}
