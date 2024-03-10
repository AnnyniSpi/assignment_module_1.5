package dev.annyni.basepatterns.behavioral.command;

public class PlayCommand implements Command{
    Phone phone;

    public PlayCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.toPlayGame();
    }
}
