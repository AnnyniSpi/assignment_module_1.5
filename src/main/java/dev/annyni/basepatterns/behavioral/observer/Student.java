package dev.annyni.basepatterns.behavioral.observer;

import java.util.List;

public class Student implements Observer{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void handleExam(List<String> exams) {
        System.out.println("Student: " + name + "\nWe have some changes in exam:\n" + exams +
                "\n=========================================================\n");
    }
}
