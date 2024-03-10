package dev.annyni.basepatterns.creational.builder;

public class HorrorBook extends BookBuilder{
    @Override
    void buildName() {
        book.setName("Alice in the Land of Horrors.");
    }

    @Override
    void buildGenre() {
        book.setGenre(Genre.HORROR);
    }

    @Override
    void buildPrice() {
        book.setPrice(1000);
    }
}
