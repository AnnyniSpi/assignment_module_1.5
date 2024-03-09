package dev.annyni.basepatterns.creational.abstractfactoryfactory.school45;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Lesson;

public class Mathematics implements Lesson {
    @Override
    public void teachLesson() {
        System.out.println("Mathematics");
    }
}
