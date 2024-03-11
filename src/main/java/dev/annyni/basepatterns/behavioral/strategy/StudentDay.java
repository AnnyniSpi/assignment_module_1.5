package dev.annyni.basepatterns.behavioral.strategy;

public class StudentDay {
    public static void main(String[] args) {
        Student student = new Student();

        student.setToDoList(new Sleeping());
        student.executeToDoList();

        student.setToDoList(new Study());
        student.executeToDoList();

        student.setToDoList(new PassingExam());
        student.executeToDoList();

        student.setToDoList(new PlayWithFriends());
        student.executeToDoList();

        student.setToDoList(new Sleeping());
        student.executeToDoList();
    }
}
