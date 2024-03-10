package dev.annyni.basepatterns.behavioral.template;

public class Student extends HelloTemplate{
    @Override
    public void info() {
        System.out.print("I'm a student. ");
        System.out.print("My name is Tom! ");
    }
}
