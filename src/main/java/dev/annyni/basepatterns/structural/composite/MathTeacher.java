package dev.annyni.basepatterns.structural.composite;

public class MathTeacher implements Teacher{
    @Override
    public void teachLesson() {
        System.out.println("A teacher teaches math.");
    }
}
