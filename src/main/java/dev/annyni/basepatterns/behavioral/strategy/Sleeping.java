package dev.annyni.basepatterns.behavioral.strategy;

public class Sleeping implements ToDoList{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
