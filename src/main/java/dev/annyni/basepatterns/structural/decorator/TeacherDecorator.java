package dev.annyni.basepatterns.structural.decorator;

public class TeacherDecorator implements Teacher{
    private Teacher teacher;

    public TeacherDecorator(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String teachLesson() {
        return teacher.teachLesson();
    }
}
