package dev.annyni.basepatterns.behavioral.mediator;

public class Atc implements IAtc{
    private Flight flight;
    private Runway runway;
    private boolean available;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailabilityStatus(Boolean status) {
        this.available = status;
    }

    @Override
    public boolean isAvailability() {
        return available;
    }
}
