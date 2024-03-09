package dev.annyni.basepatterns.creational.abstractfactoryfactory.school64;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Lesson;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.SchoolFactory;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.Student;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.Teacher;

public class School64Factory implements SchoolFactory {
    @Override
    public Lesson getLesson() {
        return new Story();
    }

    @Override
    public Teacher getTeacher() {
        return new TeacherIn64School();
    }

    @Override
    public Student getstudent() {
        return new StudentIn64School();
    }
}
