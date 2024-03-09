package dev.annyni.basepatterns.creational.factory;

public class ProgramRunner {
    public static void main(String[] args) {
        LessonFactory factory = createNewLesson("physics");
        Lesson lesson = factory.createLesson();
        lesson.teachLesson();
    }

    static LessonFactory createNewLesson(String lesson){
        if (lesson.contentEquals("story")){
            return new StoryLessonFactory();
        } else if (lesson.contentEquals("physics")) {
            return new PhysicsLessonFactory();
        } else if (lesson.contentEquals("mathematics")) {
            return new MathematicsLessonFactory();
        } else if (lesson.contentEquals("chemistry")) {
            return new ChemistryLessonFactory();
        } else {
            throw new RuntimeException(lesson + " is unknown lesson");
        }
    }
}
