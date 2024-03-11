package dev.annyni.basepatterns.behavioral.strategy;

public class Study implements ToDoList{
    @Override
    public void justDoIt() {
        System.out.println("Lear all lessons");
    }
}
