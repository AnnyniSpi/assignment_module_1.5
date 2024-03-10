package dev.annyni.basepatterns.structural.adapter;

public class AdapterToPhone extends Laptop implements Phone{
    @Override
    public void toPlayGame() {
        toPlayGameLaptop();
    }

    @Override
    public void toWatchMovie() {
        toWatchMovieLaptop();
    }
}
