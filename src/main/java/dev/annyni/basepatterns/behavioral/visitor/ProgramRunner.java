package dev.annyni.basepatterns.behavioral.visitor;

public class ProgramRunner {
    public static void main(String[] args) {
        Lesson lesson = new Math();
        lesson.learnLesson(new ConrcentVisitor());
    }
}
