package dev.annyni.basepatterns.creational.abstractfactoryfactory.school64;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Lesson;

public class Story implements Lesson {
    @Override
    public void teachLesson() {
        System.out.println("Story");
    }
}
