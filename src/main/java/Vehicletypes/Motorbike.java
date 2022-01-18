package Vehicletypes;
import VehicleProperties.*;

public class Motorbike extends Vehicle {
    public Motorbike(String colour, double price, int condition, Brakes brakes, Engine engine, Gearbox gearbox, Tyres tyres) {
        super(colour, price, condition, brakes, engine, gearbox, tyres);
    }
}
