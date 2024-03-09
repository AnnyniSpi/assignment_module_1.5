package dev.annyni.basepatterns.creational.factory;

public class ChemistryLessonFactory implements LessonFactory{
    @Override
    public Lesson createLesson() {
        return new Chemistry();
    }
}
