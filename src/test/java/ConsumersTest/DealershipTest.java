package ConsumersTest;

import Consumers.Customer;
import Consumers.Dealership;
import VehicleProperties.*;
import Vehicletypes.Car;
import Vehicletypes.Motorbike;
import Vehicletypes.Vehicle;
import org.junit.Before;
import org.junit.Test;;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Car car1;
    Car car2;
    Motorbike motorbike1;
    ArrayList<Vehicle> vehicles;
    ArrayList<Vehicle> stockVehicles;
    Dealership dealer1;
    Dealership dealer2;
    Brakes brakes;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres1;
    Customer customer1;
    Customer customer2;



    @Before
    public void before(){
        car1 = new Car("Red", 10, 100, brakes, engine, gearbox, tyres1);
        car2 = new Car("Red", 10, 100, brakes, engine, gearbox, tyres1);
        motorbike1 = new Motorbike("blue", 15, 90, brakes, engine, gearbox, tyres1);
        vehicles = new ArrayList<Vehicle>();
        stockVehicles = new ArrayList<Vehicle>();
        vehicles.add(car1);
        vehicles.add(motorbike1);
        stockVehicles.add(car2);
        dealer1 = new Dealership(1000, stockVehicles);
        dealer2 = new Dealership(8, stockVehicles);
        customer1 = new Customer(1000, vehicles);
        customer2 = new Customer(8, vehicles);
    }

    @Test
    public void has2Vehicles(){
        assertEquals(1, dealer1.getStockVehicles());
    }

    @Test
    public void canBuyVehicle(){
        dealer1.buyVehicle(car2);
        assertEquals(2,dealer1.getStockVehicles());
    }

    @Test
    public void cantBuyVehicle(){
        dealer2.buyVehicle(car2);
        assertEquals(1,dealer2.getStockVehicles());
    }

    @Test
    public void canSellToCustomer(){
        dealer2.sellVehicleToCustomer(car2, customer1);
        assertEquals(3, customer1.getOwnedVehicles());
    }
}
