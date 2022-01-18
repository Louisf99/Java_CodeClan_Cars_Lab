package Consumers;

import Vehicletypes.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double bankAccount;
    private ArrayList<Vehicle> ownedVehicles = new ArrayList<>();

    public Customer(double bankAccount, ArrayList<Vehicle> ownedVehicles) {
        this.bankAccount = bankAccount;
        this.ownedVehicles = ownedVehicles;
    }

    public int getOwnedVehicles() {
        return ownedVehicles.size();
    }

    public String buyVehicle(Vehicle vehicle) {
        if (this.bankAccount >= vehicle.getPrice()) {
            ownedVehicles.add(vehicle);
            return "Vehicle Added";
        } else {
            return "You don't have enough money";
        }
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBankAccount() {
        return bankAccount;
    }
}
