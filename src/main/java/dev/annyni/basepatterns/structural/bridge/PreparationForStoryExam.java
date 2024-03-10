package dev.annyni.basepatterns.structural.bridge;

public class PreparationForStoryExam extends PreparationForExam{
    protected PreparationForStoryExam(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void preparation() {
        System.out.println("Soon exam for story. You need study.");
        teacher.teachLesson();
    }
}
