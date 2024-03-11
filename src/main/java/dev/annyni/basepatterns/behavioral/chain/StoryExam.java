package dev.annyni.basepatterns.behavioral.chain;

public class StoryExam extends PassingExams{
    public StoryExam(Priority priority) {
        super(priority);
    }

    @Override
    public void passing(String exam) {
        System.out.println("The student takes an unimportant the exam for admission to the institute in the subject: " + exam);
    }
}
