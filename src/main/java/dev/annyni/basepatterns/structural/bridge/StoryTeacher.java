package dev.annyni.basepatterns.structural.bridge;

public class StoryTeacher implements Teacher{
    @Override
    public void teachLesson() {
        System.out.println("A teacher teaches story.");
    }
}
