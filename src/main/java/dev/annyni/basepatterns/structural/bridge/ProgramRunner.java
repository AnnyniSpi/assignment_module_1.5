package dev.annyni.basepatterns.structural.bridge;

public class ProgramRunner {
    public static void main(String[] args) {
        PreparationForExam[] exams = {
                new PreparationForMathExam(new MathTeacher()),
                new PreparationForStoryExam(new StoryTeacher())
        };

        for (PreparationForExam exam : exams) {
            exam.preparation();
        }
    }
}
