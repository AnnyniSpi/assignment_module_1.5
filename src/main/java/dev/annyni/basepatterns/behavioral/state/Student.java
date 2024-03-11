package dev.annyni.basepatterns.behavioral.state;

public class Student {
    ToDoList toDoList;

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    public void changeToDoList(){
        if (toDoList instanceof Sleeping){
            System.out.println("Wakeup! Go to school!");
            setToDoList(new Study());
        } else if (toDoList instanceof Study) {
            System.out.println("While preparing for exams");
            setToDoList(new PassingExam());
        } else if (toDoList instanceof PassingExam){
            System.out.println("Time to relax");
            setToDoList(new PlayWithFriends());
        } else {
            setToDoList(new Sleeping());
        }
    }

    public void justDoIt(){
        toDoList.justDoIt();
    }
}
