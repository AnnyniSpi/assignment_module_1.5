package dev.annyni.basepatterns.behavioral.visitor;

public class Math implements Lesson{
    @Override
    public void learnLesson(Visitor visitor) {
        visitor.learnMath();
    }
}
