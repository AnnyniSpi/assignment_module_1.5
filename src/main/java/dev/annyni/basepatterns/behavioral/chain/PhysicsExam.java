package dev.annyni.basepatterns.behavioral.chain;

public class PhysicsExam extends PassingExams{
    public PhysicsExam(Priority priority) {
        super(priority);
    }

    @Override
    public void passing(String exam) {
        System.out.println("The student takes the exam for admission to the institute in the subject: " + exam);
    }
}
