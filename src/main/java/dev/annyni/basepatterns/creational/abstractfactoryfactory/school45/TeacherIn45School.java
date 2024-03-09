package dev.annyni.basepatterns.creational.abstractfactoryfactory.school45;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Teacher;

public class TeacherIn45School implements Teacher {
    @Override
    public void teachStudents() {
        System.out.println("Teaches student this lesson in 45 school");
    }
}
