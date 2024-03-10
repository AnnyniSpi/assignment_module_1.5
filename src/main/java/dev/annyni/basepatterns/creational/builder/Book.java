package dev.annyni.basepatterns.creational.builder;

public class Book {
    private String name;
    Genre genre;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + name + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                '}';
    }
}
