package dev.annyni.basepatterns.behavioral.chain;

public class MathExam extends PassingExams{
    public MathExam(Priority priority) {
        super(priority);
    }

    @Override
    public void passing(String exam) {
        System.out.println("The student takes an important the exam for admission to the institute in the subject: " + exam);
    }
}
