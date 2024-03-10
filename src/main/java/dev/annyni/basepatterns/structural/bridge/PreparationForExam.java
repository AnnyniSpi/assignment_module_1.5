package dev.annyni.basepatterns.structural.bridge;

public abstract class PreparationForExam {
    protected Teacher teacher;

    protected PreparationForExam(Teacher teacher) {
        this.teacher = teacher;
    }

    public abstract void preparation();
}
