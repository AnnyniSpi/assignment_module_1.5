package dev.annyni.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void main(String[] args) {
        LessonFactory factory = new LessonFactory();

        List<Lesson> lessons = new ArrayList<>();

        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Mark"));
        lessons.add(factory.getLessonFromTeacher("Rosa"));

        for (Lesson lesson : lessons) {
            lesson.learnLesson();
        }

    }
}
