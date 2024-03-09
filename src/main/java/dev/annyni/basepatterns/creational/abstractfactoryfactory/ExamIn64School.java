package dev.annyni.basepatterns.creational.abstractfactoryfactory;

import dev.annyni.basepatterns.creational.abstractfactoryfactory.school64.School64Factory;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school64.Story;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school64.StudentIn64School;
import dev.annyni.basepatterns.creational.abstractfactoryfactory.school64.TeacherIn64School;

public class ExamIn64School {
    public static void main(String[] args) {
        SchoolFactory factory = new School64Factory();
        Lesson lesson = new Story();
        Teacher teacher = new TeacherIn64School();
        Student student = new StudentIn64School();

        System.out.println("Exam in progress...");
        System.out.println("Lesson: ");
        lesson.teachLesson();
        teacher.teachStudents();
        student.toTakeExam();
    }
}
