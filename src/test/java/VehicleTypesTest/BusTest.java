package VehicleTypesTest;

import VehicleProperties.*;
import Vehicletypes.Bus;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BusTest {

    Bus bus;
    Brakes brakes;
    Engine engine;
    Gearbox gearbox;
    Tyres tyres1;




    @Before
    public void before(){
        engine = new Engine(1.2, "Diesel");
        tyres1 = new Tyres(TyreType.tube, 8);
        brakes = new Brakes(true);
        gearbox = new Gearbox("Automatic");
        bus  = new Bus ("Red", 10, 100, brakes, engine, gearbox, tyres1);
    }

    @Test
    public void testWheels(){
        assertEquals(8, bus.getTyres());
    }

    @Test
    public void hasColourRed(){
        assertEquals("Red", bus.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, bus.getPrice(),0.0);
    }

    @Test
    public void hasEngineSize(){
        assertEquals(1.2, bus.getEngineSize(), 0.0);
    }

    @Test
    public void haBrakes(){
        assertEquals(true, bus.getBrakes());
    }

    @Test
    public void hasGearbox(){
        assertEquals("Automatic", bus.getGearbox());
    }

    @Test
    public void hasTyreType(){
        assertEquals(TyreType.tube, bus.getTyresType());
    }




}