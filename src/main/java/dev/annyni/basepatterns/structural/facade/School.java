package dev.annyni.basepatterns.structural.facade;

public class School {
    private boolean open;

    public boolean isOpen() {
        return open;
    }

    public void openSchool(){
        System.out.println("School is open!");
        open = true;
    }

    public void closeSchool(){
        System.out.println("School is not open!");
        open = false;
    }
}
