package dev.annyni.basepatterns.behavioral.template;

public abstract class HelloTemplate {
    public void sayHello(){
        System.out.print("Hello! ");
        info();
        System.out.print("How are you? ");
    }

    public abstract void info();
}
