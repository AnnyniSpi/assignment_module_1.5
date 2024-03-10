package dev.annyni.basepatterns.behavioral.iterator;

import java.util.Arrays;

public class Student implements Collection{
    private String name;
    private int age;
    private String[] lessons;

    public Student(String name, int age, String[] lessons) {
        this.name = name;
        this.age = age;
        this.lessons = lessons;
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

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = new String[]{lessons};
    }

    @Override
    public Iterator getIterator() {
        return new LessonIterator();
    }

    private class LessonIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < lessons.length){
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            return lessons[index++];
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
