package dev.annyni.basepatterns.behavioral.mediator;

public class Runway implements Command{
    private IAtc atcMediator;

    public Runway(IAtc atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for landing!");
        atcMediator.setAvailabilityStatus(true);
    }
}
