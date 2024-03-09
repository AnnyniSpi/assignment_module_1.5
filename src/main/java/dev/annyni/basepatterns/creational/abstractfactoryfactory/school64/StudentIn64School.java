package dev.annyni.basepatterns.creational.abstractfactoryfactory.school64;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Student;

public class StudentIn64School implements Student {
    @Override
    public void toTakeExam() {
        System.out.println("To take the exam in 64 school.");
    }
}
