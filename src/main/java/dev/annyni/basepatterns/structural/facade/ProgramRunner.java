package dev.annyni.basepatterns.structural.facade;

public class ProgramRunner {
    public static void main(String[] args) {
        SchoolFacade facade = new SchoolFacade();
        facade.startSchoolDay();
    }
}
