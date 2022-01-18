package VehicleProperties;

public class Engine {
    private double size;
    private String type;

    public Engine(double size, String type) {
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
