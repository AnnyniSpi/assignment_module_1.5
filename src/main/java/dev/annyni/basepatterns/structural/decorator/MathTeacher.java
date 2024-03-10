package dev.annyni.basepatterns.structural.decorator;

public class MathTeacher implements Teacher{
    @Override
    public String teachLesson() {
        return "A teacher teaches math. ";
    }
}
