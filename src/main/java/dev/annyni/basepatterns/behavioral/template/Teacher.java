package dev.annyni.basepatterns.behavioral.template;

public class Teacher extends HelloTemplate{
    @Override
    public void info() {
        System.out.print("I'm a teacher. ");
        System.out.print("My name is Mark! ");
    }
}
