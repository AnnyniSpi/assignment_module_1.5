package dev.annyni.basepatterns.behavioral.mediator;

public interface IAtc {
    void registerFlight(Flight flight);
    void registerRunway(Runway runway);
    void setAvailabilityStatus(Boolean status);
    boolean isAvailability();
}
