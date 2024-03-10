package dev.annyni.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EGY implements Observed{
    List<String> exams;
    List<Observer> students = new ArrayList<>();

    public void addExam(String exam){
        if (exams == null){
            exams = new ArrayList<>();
        }

        exams.add(exam);
        notifyObservers();
    }

    public void removeExam(String exam){
        exams.remove(exam);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : students) {
            observer.handleExam(exams);
        }
    }
}
