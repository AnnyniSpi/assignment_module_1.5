package dev.annyni.basepatterns.behavioral.interpreter;

public class ProgramRunner {
    public static void main(String[] args) {
        Assessment fail = passedAllExams();
        Assessment success = passedOneExam();

        System.out.println("Success: " + success.takeExam("math physics"));
        System.out.println("Fail: " + fail.takeExam("math physics"));

    }

    public static Assessment passedAllExams() {
        Assessment success1 = new TerminalAssessment("math");
        Assessment success2 = new TerminalAssessment("story");

        return new AndAssessment(success1, success2);
    }

    public static Assessment passedOneExam() {
        Assessment success1 = new TerminalAssessment("math");
        Assessment success2 = new TerminalAssessment("story");

        return new OrAssessment(success1, success2);
    }
}
