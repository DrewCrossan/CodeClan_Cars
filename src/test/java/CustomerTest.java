import Customers.Customer;
import Vehicles.DieselCar;
import Vehicles.Engine;
import Vehicles.Tyres;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static Vehicles.CarType.COUPE;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private DieselCar dieselCar;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void setUp(){

        customer = new Customer(20000);
        engine = new Engine("BMW", 100, 100);
        tyres = new Tyres("Goodyear", "240/45R1699W");
        dieselCar = new DieselCar(engine, tyres, 19000, "black", COUPE);
    }

    @Test
    public void hasMoney(){
        assertEquals(20000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasOwnedVehicle(){
        customer.addVehicle(dieselCar);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals("BMW", dieselCar.getEngine().getModel());
    }
}
