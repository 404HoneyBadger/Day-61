package TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.print();
        System.out.println();
        list.remove(3);
        list.print();
    }
}
