package dev.annyni.basepatterns.behavioral.command;

public class WatchCommand implements Command{
    Phone phone;

    public WatchCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.toWatchMovie();
    }
}
