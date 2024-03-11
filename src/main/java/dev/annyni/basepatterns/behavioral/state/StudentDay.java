package dev.annyni.basepatterns.behavioral.state;

public class StudentDay {
    public static void main(String[] args) {
        ToDoList toDoList = new Sleeping();
        Student student = new Student();

        student.setToDoList(toDoList);

        for (int i = 0; i <10 ; i++) {
            student.justDoIt();
            student.changeToDoList();
        }
    }
}
