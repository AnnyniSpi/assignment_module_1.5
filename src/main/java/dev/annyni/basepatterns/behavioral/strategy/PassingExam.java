package dev.annyni.basepatterns.behavioral.strategy;

public class PassingExam implements ToDoList{
    @Override
    public void justDoIt() {
        System.out.println("Passing the exam");
    }
}
