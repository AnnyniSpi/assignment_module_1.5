package dev.annyni.basepatterns.structural.decorator;

public class MathAndPhysicsTeacher extends TeacherDecorator{
    public MathAndPhysicsTeacher(Teacher teacher){
        super(teacher);
    }
    @Override
    public String teachLesson() {
        return super.teachLesson() + teachPhysics();
    }

    public String teachPhysics() {
        return "A Teacher teaches physics. ";
    }
}
