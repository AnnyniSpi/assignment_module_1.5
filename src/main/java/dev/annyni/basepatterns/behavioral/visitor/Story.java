package dev.annyni.basepatterns.behavioral.visitor;

public class Story implements Lesson{
    @Override
    public void learnLesson(Visitor visitor) {
        visitor.learnStory();
    }
}
