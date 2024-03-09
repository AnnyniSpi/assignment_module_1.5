package dev.annyni.basepatterns.creational.abstractfactoryfactory.school45;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Student;

public class StudentIn45School implements Student {
    @Override
    public void toTakeExam() {
        System.out.println("To take the exam in 45 school.");
    }
}
