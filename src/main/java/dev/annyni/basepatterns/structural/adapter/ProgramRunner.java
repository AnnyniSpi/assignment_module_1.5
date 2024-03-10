package dev.annyni.basepatterns.structural.adapter;

public class ProgramRunner {
    public static void main(String[] args) {
        Phone phone = new AdapterToPhone();

        phone.toPlayGame();
        phone.toWatchMovie();
    }
}
