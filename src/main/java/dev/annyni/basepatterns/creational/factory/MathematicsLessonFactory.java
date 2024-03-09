package dev.annyni.basepatterns.creational.factory;

public class MathematicsLessonFactory implements LessonFactory{
    @Override
    public Lesson createLesson() {
        return new Mathematics();
    }
}
