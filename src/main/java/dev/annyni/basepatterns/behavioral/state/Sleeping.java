package dev.annyni.basepatterns.behavioral.state;

public class Sleeping implements ToDoList{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
