package dev.annyni.basepatterns.creational.prototype;

public class Student implements Copyable{
    private String name;
    private int age;
    private Faculty faculty;

    public Student(String name, int age, Faculty faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Faculty getDepartment() {
        return faculty;
    }

    public void setDepartment(Faculty department) {
        this.faculty = department;
    }


    @Override
    public Object copy() {
        Student copy =  new Student(name, age, faculty);
        return copy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + faculty +
                '}';
    }
}
