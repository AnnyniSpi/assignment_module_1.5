package dev.annyni.basepatterns.behavioral.mediator;

public class ProgramRunner {
    public static void main(String[] args) {
        IAtc atcMediatr = new Atc();
        Runway runway = new Runway(atcMediatr);

        Flight flight1 = new Flight(atcMediatr);
        Flight flight2 = new Flight(atcMediatr);

        atcMediatr.registerFlight(flight1);
        atcMediatr.registerRunway(runway);

        flight1.readyToLand();
        runway.land();
        flight1.land();

        flight2.land();

        flight1.parked();

        flight2.land();
    }
}
