package com.somsubhra;

import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> todoList=new ArrayList<String>();

    //Add list item

    public void addItem(String item) {
        todoList.add(item);
    }

    //remove list item

    public void removeItem(int index) {
        String myItem=todoList.get(index);
        todoList.remove(index);
    }

    // print entire list

    public void printTodoList() {
        System.out.println("List consists: "+todoList.size()+" items");
        for(String i:todoList) {
            System.out.println(i);
        }
    }

    //update the list

    public void updateTodo(int index, String item) {
        todoList.set(index, item);
        System.out.println("Added successfully at "+(index+1));
    }

    //search item in list

    public String searchTodo(String searchitem) {
        int index=todoList.indexOf(searchitem);
        if(index==-1) {
            return "";
        } else {
            return todoList.get(index);
        }
    }
}
