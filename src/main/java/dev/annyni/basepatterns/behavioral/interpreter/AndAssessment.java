package dev.annyni.basepatterns.behavioral.interpreter;

public class AndAssessment implements Assessment{
    Assessment assessment1;
    Assessment assessment2;

    public AndAssessment(Assessment assessment1, Assessment assessment2) {
        this.assessment1 = assessment1;
        this.assessment2 = assessment2;
    }

    @Override
    public boolean takeExam(String lesson) {
        return assessment1.takeExam(lesson) && assessment2.takeExam(lesson);
    }
}
