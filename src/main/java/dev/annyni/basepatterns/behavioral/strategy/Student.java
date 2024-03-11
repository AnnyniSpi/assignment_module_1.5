package dev.annyni.basepatterns.behavioral.strategy;

public class Student {
    ToDoList toDoList;

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    public void executeToDoList(){
        toDoList.justDoIt();
    }
}
