package dev.annyni.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LessonFactory {
    private static final Map<String, Lesson> lessons = new HashMap<>();

    public Lesson getLessonFromTeacher(String name){
        Lesson lesson = lessons.get(name);

        if (lesson == null){
            switch (name){
                case "Mark":
                    System.out.println(name + " is a teacher physics...");
                    lesson = new Physics();
                    break;
                case "Rosa":
                    System.out.println(name + " is a teacher story...");
                    lesson = new Story();
                    break;
            }

            lessons.put(name, lesson);
        }

        return lesson;
    }
}
