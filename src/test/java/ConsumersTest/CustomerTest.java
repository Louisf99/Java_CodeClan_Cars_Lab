package ConsumersTest;
import Consumers.Customer;
import VehicleProperties.Brakes;
import VehicleProperties.Engine;
import VehicleProperties.Gearbox;
import VehicleProperties.Tyres;
import Vehicletypes.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Car car1;
    Car car2;
    Motorbike motorbike1;
    ArrayList<Vehicle> vehicles;
    Customer customer1;
    Customer customer2;
    Brakes brakes;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres1;


    @Before
    public void before(){
        car1 = new Car("Red", 10, 100, brakes, engine, gearbox, tyres1);
        car2 = new Car("Red", 10, 100, brakes, engine, gearbox, tyres1);
        motorbike1 = new Motorbike("blue", 15, 90, brakes, engine, gearbox, tyres1);
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(car1);
        vehicles.add(motorbike1);
        customer1 = new Customer(1000, vehicles);
        customer2 = new Customer(8, vehicles);
    }

    @Test
    public void has2Vehicles(){
        assertEquals(2, customer1.getOwnedVehicles());
    }

    @Test
    public void canBuyVehicle(){
        customer1.buyVehicle(car2);
        assertEquals(3,customer1.getOwnedVehicles());
    }

    @Test
    public void cantBuyVehicle(){
        customer2.buyVehicle(car2);
        assertEquals(2,customer2.getOwnedVehicles());
    }



}
