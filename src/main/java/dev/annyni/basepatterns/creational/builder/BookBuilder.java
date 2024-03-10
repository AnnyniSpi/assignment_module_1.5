package dev.annyni.basepatterns.creational.builder;

public abstract class BookBuilder {
    Book book;

    void createBook(){
        book = new Book();
    }

    abstract void buildName();
    abstract void buildGenre();
    abstract void buildPrice();


    public Book getBook() {
        return book;
    }
}
