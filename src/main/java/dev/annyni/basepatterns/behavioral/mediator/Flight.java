package dev.annyni.basepatterns.behavioral.mediator;

public class Flight implements Command{
    private IAtc atcMediator;

    public Flight(IAtc atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isAvailability()){
            System.out.println("Landed successfully");
            atcMediator.setAvailabilityStatus(false);
        } else {
            System.out.println("Waiting for Runway");
        }
    }

    public void readyToLand(){
        System.out.println("Landing initiated");
    }

    public void parked(){
        System.out.println("Flight is parked!");
        atcMediator.setAvailabilityStatus(true);
    }
}
