package dev.annyni.basepatterns.creational.builder;

public class Director {
    BookBuilder builder;

    public void setBuilder(BookBuilder builder) {
        this.builder = builder;
    }

    Book builderBook(){
        builder.createBook();
        builder.buildName();
        builder.buildGenre();
        builder.buildPrice();

        return builder.getBook();
    }
}
