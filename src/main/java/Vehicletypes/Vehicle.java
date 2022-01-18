package Vehicletypes;
import VehicleProperties.*;

public abstract class Vehicle {
    private String colour;
    private double price;
    private int condition;
    Brakes brakes;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres;

    public Vehicle(String colour, double price, int condition, Brakes brakes, Engine engine, Gearbox gearbox, Tyres tyres) {
        this.colour = colour;
        this.price = price;
        this.condition = condition;
        this.brakes = brakes;
        this.engine = engine;
        this.gearbox = gearbox;
        this.tyres = tyres;
    }

    public String getColour() {
        return this.colour;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public boolean getBrakes() {
        return brakes.getBrakes();
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public double getEngineSize() {
        return engine.getSize();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox.getGearbox();
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public int getTyres() {
        return tyres.getNumberOfTyres();
    }

    public TyreType getTyresType() {
        return tyres.getTyreType();
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
