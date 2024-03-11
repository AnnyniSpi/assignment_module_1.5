package dev.annyni.basepatterns.behavioral.interpreter;

public class OrAssessment implements Assessment{
    Assessment assessment1;
    Assessment assessment2;

    public OrAssessment(Assessment assessment1, Assessment assessment2) {
        this.assessment1 = assessment1;
        this.assessment2 = assessment2;
    }

    @Override
    public boolean takeExam(String lesson) {
        return assessment1.takeExam(lesson) || assessment2.takeExam(lesson);
    }
}
