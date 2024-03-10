package dev.annyni.basepatterns.behavioral.command;

public class ProgramRunner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Laptop laptop = new Laptop(
                new PlayCommand(phone),
                new WatchCommand(phone)
        );

        laptop.playGame();
        laptop.watchMovie();

    }
}
