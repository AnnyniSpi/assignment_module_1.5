package dev.annyni.basepatterns.structural.decorator;

public class ProgramRunner {
    public static void main(String[] args) {
        Teacher teacher = new MathAndPhysicsAndStoryTeacher(new MathAndPhysicsTeacher(new MathTeacher()));

        System.out.println(teacher.teachLesson());
    }
}
