package dev.annyni.basepatterns.behavioral.command;

public class Laptop {
    Command play;
    Command watch;

    public Laptop(Command play, Command watch) {
        this.play = play;
        this.watch = watch;
    }

    public void playGame(){
        play.execute();
    }

    public void watchMovie(){
        watch.execute();
    }
}
