package dev.annyni.basepatterns.structural.facade;

public class SchoolFacade {
    Student student = new Student();
    Teacher teacher = new Teacher();
    School school = new School();

    public void startSchoolDay(){
        student.studyLesson();
        school.openSchool();
        teacher.doTeachStudent(school);
        student.studyLessonInSchool();
    }

}
