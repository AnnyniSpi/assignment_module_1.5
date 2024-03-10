package dev.annyni.basepatterns.structural.decorator;

public class MathAndPhysicsAndStoryTeacher extends TeacherDecorator{
    public MathAndPhysicsAndStoryTeacher(Teacher teacher) {
        super(teacher);
    }

    @Override
    public String teachLesson() {
        return super.teachLesson() + teachStory();
    }

    public String teachStory() {
        return "A Teacher teaches story.";
    }
}
