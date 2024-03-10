package dev.annyni.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ToDoList.getToDoList().addEntry("Write code");
        ToDoList.getToDoList().addEntry("Read book");
        ToDoList.getToDoList().addEntry("Go to the gum");

        ToDoList.getToDoList().showToDoList();
    }
}
