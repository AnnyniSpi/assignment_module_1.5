package dev.annyni.basepatterns.creational.singleton;

public class ToDoList {
    private static ToDoList toDoList;
    private static String list = "This is to-do list! \n";

    public static synchronized ToDoList getToDoList(){
        if (toDoList == null){
            toDoList = new ToDoList();
        }

        return toDoList;
    }

    private ToDoList(){

    }

    public void addEntry(String entry){
        list += entry + "\n";
    }

    public void showToDoList(){
        System.out.println(list);
    }
}
