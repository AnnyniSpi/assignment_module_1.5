package dev.annyni.basepatterns.creational.prototype;

public class CopyRunner {
    public static void main(String[] args) {
        Student student = new Student("Lisa",22, Faculty.IT);
        System.out.println(student);

        StudentFactory factory = new StudentFactory(student);
        Student cloneStudent = factory.cloneStudent();
        System.out.println("<================================================>");
        System.out.println(cloneStudent);
    }
}
