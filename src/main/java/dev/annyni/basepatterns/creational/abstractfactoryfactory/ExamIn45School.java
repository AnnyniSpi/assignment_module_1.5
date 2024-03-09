package dev.annyni.basepatterns.creational.abstractfactoryfactory;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.school45.Mathematics;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school45.School45Factory;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school45.StudentIn45School;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school45.TeacherIn45School;

public class ExamIn45School {
    public static void main(String[] args) {
        SchoolFactory factory = new School45Factory();
        Lesson lesson = new Mathematics();
        Teacher teacher = new TeacherIn45School();
        Student student = new StudentIn45School();

        System.out.println("Exam in progress...");
        System.out.println("Lesson: ");
        lesson.teachLesson();
        teacher.teachStudents();
        student.toTakeExam();
    }
}
