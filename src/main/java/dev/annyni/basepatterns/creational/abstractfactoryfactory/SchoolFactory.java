package dev.annyni.basepatterns.creational.abstractfactoryfactory;

public interface SchoolFactory {
    Lesson getLesson();

    Teacher getTeacher();

    Student getstudent();
}
