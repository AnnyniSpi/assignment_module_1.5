package dev.annyni.basepatterns.structural.adapter;

import dev.annyni.basepatterns.behavioral.command.PlayCommand;
import dev.annyni.basepatterns.behavioral.command.WatchCommand;

public class Laptop {

    public void toPlayGameLaptop(){
        System.out.println("Play games!");
    }

    public void toWatchMovieLaptop(){
        System.out.println("Watch movies!");
    }
}
