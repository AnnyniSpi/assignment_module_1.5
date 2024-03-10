package dev.annyni.basepatterns.creational.prototype;

public class StudentFactory {
    Student student;

    public StudentFactory(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student cloneStudent(){
        return (Student) student.copy();
    }
}
