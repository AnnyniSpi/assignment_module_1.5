package dev.annyni.basepatterns.creational.builder;

public class BuilderBookRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new RomanceBook());
        Book book = director.builderBook();

        System.out.println(book);

    }
}