package dev.annyni.basepatterns.behavioral.iterator;

public class StudentRunner {
    public static void main(String[] args) {
        String[] lesson = {"math", "story", "physics", "chemistry"};
        Student student = new Student("Lisa", 23, lesson);

        Iterator iterator = student.getIterator();
        System.out.println("Student: " + student);
        System.out.println("Lesson: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
