package dev.annyni.basepatterns.creational.factory;

public class StoryLessonFactory implements LessonFactory{
    @Override
    public Lesson createLesson() {
        return new Story();
    }
}
