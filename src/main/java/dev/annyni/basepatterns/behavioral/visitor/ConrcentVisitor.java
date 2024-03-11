package dev.annyni.basepatterns.behavioral.visitor;

public class ConrcentVisitor implements Visitor{
    @Override
    public void learnMath() {
        System.out.println("Student learn math!");
    }

    @Override
    public void learnStory() {
        System.out.println("Student learn story!");
    }
}
