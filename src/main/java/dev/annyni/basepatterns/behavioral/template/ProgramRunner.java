package dev.annyni.basepatterns.behavioral.template;

public class ProgramRunner {
    public static void main(String[] args) {
        HelloTemplate student = new Student();
        HelloTemplate teacher = new Teacher();

        student.sayHello();

        System.out.println("\n========================================================");

        teacher.sayHello();
    }
}
