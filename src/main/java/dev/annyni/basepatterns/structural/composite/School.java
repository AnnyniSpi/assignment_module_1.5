package dev.annyni.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;

    public void addTeacher(Teacher teacher){
        if (teachers == null){
            teachers = new ArrayList<>();
        }

        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public void preparingForExams(){
        System.out.println("Preparing for Exams!");

        for (Teacher teacher : teachers) {
            teacher.teachLesson();
        }
    }
}
