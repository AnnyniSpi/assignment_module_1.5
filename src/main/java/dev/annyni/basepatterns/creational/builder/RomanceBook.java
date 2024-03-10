package dev.annyni.basepatterns.creational.builder;

public class RomanceBook extends BookBuilder{
    @Override
    void buildName() {
        book.setName("Love in big city.");
    }

    @Override
    void buildGenre() {
        book.setGenre(Genre.ROMANCE);
    }

    @Override
    void buildPrice() {
        book.setPrice(1400);
    }
}
