package dev.annyni.basepatterns.behavioral.interpreter;

public class TerminalAssessment implements Assessment{
    private String exam;

    public TerminalAssessment(String lesson) {
        this.exam = lesson;
    }

    @Override
    public boolean takeExam(String lesson) {
        if (lesson.contains(exam)){
            return true;
        }

        return false;
    }
}
