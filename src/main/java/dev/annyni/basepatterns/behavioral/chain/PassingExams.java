package dev.annyni.basepatterns.behavioral.chain;

public abstract class PassingExams {
    private Priority priority;
    private PassingExams nextPassingExam;

    public PassingExams(Priority priority) {
        this.priority = priority;
    }

    public void setNextPassingExam(PassingExams nextPassingExam){
        this.nextPassingExam = nextPassingExam;
    }

    public void passingExamsManager(String exam, Priority priorityLevel){
        if (priorityLevel.ordinal() >= priority.ordinal()){
            passing(exam);
        }
        if (nextPassingExam != null){
            nextPassingExam.passingExamsManager(exam, priorityLevel);
        }
    }

    public abstract void passing(String exam);


}

