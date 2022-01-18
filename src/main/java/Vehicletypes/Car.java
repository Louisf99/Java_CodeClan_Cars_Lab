package Vehicletypes;

import VehicleProperties.*;

public class Car extends Vehicle {
    public Car(String colour, double price, int condition, Brakes brakes, Engine engine, Gearbox gearbox, Tyres tyres) {
        super(colour, price, condition, brakes, engine, gearbox, tyres);
    }
}
