package Consumers;

import Vehicletypes.Vehicle;
import Consumers.Customer;

import java.util.ArrayList;

public class Dealership {
        private double till;
        private ArrayList<Vehicle> stockVehicles = new ArrayList<>();

    public Dealership(double till, ArrayList<Vehicle> stockVehicles) {
        this.till = till;
        this.stockVehicles = stockVehicles;
    }

    public double getTill() {
        return till;
    }

    public int getStockVehicles() {
        return stockVehicles.size();
    }

    public String buyVehicle(Vehicle vehicle) {
        if (this.till >= vehicle.getPrice()) {
            stockVehicles.add(vehicle);
            return "Vehicle Added";
        } else {
            return "You don't have enough money";
        }
    }

    public String sellVehicleToCustomer(Vehicle vehicle, Customer customer) {
        if ( customer.getBankAccount() >= vehicle.getPrice()) {
            this.stockVehicles.remove(vehicle);
            customer.buyVehicle(vehicle);
            this.till += vehicle.getPrice();
            customer.setBankAccount( customer.getBankAccount() - vehicle.getPrice());
            return "Vehicle added to customer stock";
        } else {
            return "You don't have enough money";
        }
    }


}


