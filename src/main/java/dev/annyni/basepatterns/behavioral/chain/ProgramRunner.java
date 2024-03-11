package dev.annyni.basepatterns.behavioral.chain;

public class ProgramRunner {
    public static void main(String[] args) {
        PassingExams storyExam = new StoryExam(Priority.LOW);
        PassingExams physicsExam = new PhysicsExam(Priority.MEDIUM);
        PassingExams mathExam = new MathExam(Priority.HIGH);

        storyExam.setNextPassingExam(physicsExam);
        physicsExam.setNextPassingExam(mathExam);

        storyExam.passingExamsManager("Story not important exam!", Priority.LOW);
        physicsExam.passingExamsManager("Physics exam!", Priority.MEDIUM);
        mathExam.passingExamsManager("Math an important exam!", Priority.HIGH);
    }
}
