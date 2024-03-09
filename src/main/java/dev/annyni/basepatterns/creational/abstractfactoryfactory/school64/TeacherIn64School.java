package dev.annyni.basepatterns.creational.abstractfactoryfactory.school64;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Teacher;

public class TeacherIn64School implements Teacher {
    @Override
    public void teachStudents() {
        System.out.println("Teaches student this lesson in 64 school");
    }
}
