package dev.annyni.basepatterns.structural.proxy;

public class ProxyUser implements User{
    private String name;
    private int age;
    private RealUser user;

    public ProxyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello() {
        if (user == null){
            user = new RealUser(name, age);
        }

        user.sayHello();
    }
}
