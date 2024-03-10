package dev.annyni.basepatterns.structural.proxy;

public class ProgramRunner {
    public static void main(String[] args) {
        User user = new ProxyUser("Rita", 30);

        user.sayHello();
    }
}
