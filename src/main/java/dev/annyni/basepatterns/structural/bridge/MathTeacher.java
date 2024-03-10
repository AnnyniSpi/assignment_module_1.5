package dev.annyni.basepatterns.structural.bridge;

public class MathTeacher implements  Teacher{
    @Override
    public void teachLesson() {
        System.out.println("A teacher teaches math.");
    }
}
