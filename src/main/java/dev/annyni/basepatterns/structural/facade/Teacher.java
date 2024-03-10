package dev.annyni.basepatterns.structural.facade;

public class Teacher {
    public void doTeachStudent(School school){
        if (school.isOpen()){
            System.out.println("Teacher teach student!");
        } else {
            System.out.println("Teacher sleep at home!");
        }

    }
}
