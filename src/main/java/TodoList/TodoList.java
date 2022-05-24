package TodoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listArr;

    public TodoList(){
        this.listArr=new ArrayList<String>();
    }

    public void add(String taskInput){
        this.listArr.add(taskInput);
    }

    public void print(){
        for(int i =0; i< listArr.size(); i++){
            int index = listArr.indexOf(listArr.get(i))+1;
            System.out.println(index + ". " + listArr.get(i));

        }
    }

    public void remove(int number){
        this.listArr.remove(number-1);
    }



}
