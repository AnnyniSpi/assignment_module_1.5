package dev.annyni.basepatterns.creational.factory;

public class PhysicsLessonFactory implements LessonFactory{
    @Override
    public Lesson createLesson() {
        return new Physics();
    }
}
