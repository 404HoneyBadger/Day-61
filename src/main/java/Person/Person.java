package Person;

import java.util.ArrayList;

public class Person {
    private String name;
    private String addy;
    Person(String pName, String pAddy){
        this.name = pName;
        this.addy = pAddy;
    }

    public Person() {
    }

    @Override
    public String toString(){
        return name + "\n" + addy;
    }

    public static void main(String[] args) {

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }
}
