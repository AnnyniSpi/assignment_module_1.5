package dev.annyni.basepatterns.structural.bridge;

public class PreparationForMathExam extends PreparationForExam{
    protected PreparationForMathExam(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void preparation() {
        System.out.println("Soon exam for math. You need study.");
        teacher.teachLesson();
    }
}
