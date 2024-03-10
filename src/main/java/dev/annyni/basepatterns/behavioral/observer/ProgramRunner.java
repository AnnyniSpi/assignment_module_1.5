package dev.annyni.basepatterns.behavioral.observer;

public class ProgramRunner {
    public static void main(String[] args) {
        EGY egy = new EGY();
        egy.addExam("math");
        egy.addExam("story");

        Observer student1 = new Student("Lola");
        Observer student2 = new Student("Ira");

        egy.addObserver(student1);
        egy.addObserver(student2);

        egy.addExam("physics");
        egy.removeExam("story");
    }
}
