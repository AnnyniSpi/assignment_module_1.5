package dev.annyni.basepatterns.creational.abstractfactoryfactory.school45;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.Lesson;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.SchoolFactory;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.Student;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.Teacher;

public class School45Factory implements SchoolFactory {
    @Override
    public Lesson getLesson() {
        return new Mathematics();
    }

    @Override
    public Teacher getTeacher() {
        return new TeacherIn45School();
    }

    @Override
    public Student getstudent() {
        return new StudentIn45School();
    }
}
