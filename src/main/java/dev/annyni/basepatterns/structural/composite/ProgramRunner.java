package dev.annyni.basepatterns.structural.composite;

public class ProgramRunner {
    public static void main(String[] args) {
        School school = new School();

        Teacher teacherMath = new MathTeacher();
        Teacher firstTeacherStory = new StoryTeacher();
        Teacher secondTeacherStory = new StoryTeacher();

        school.addTeacher(teacherMath);
        school.addTeacher(firstTeacherStory);
        school.addTeacher(secondTeacherStory);

        school.preparingForExams();
    }
}
