package dev.annyni.basepatterns.structural.proxy;

public class RealUser implements User{
    private String name;
    private int age;

    public RealUser(String name, int age) {
        this.name = name;
        this.age = age;
        search();
    }

    public void search() {
        System.out.println("Search person with name: " + name + " and age: " + age);
    }


    @Override
    public void sayHello() {
        System.out.println("User: " + name + " - says Hello!");
    }
}
