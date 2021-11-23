import Vehicles.CarType;
import Vehicles.DieselCar;
import Vehicles.Engine;
import Vehicles.Tyres;
import org.junit.Before;
import org.junit.Test;

import static Vehicles.CarType.COUPE;
import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    DieselCar dieselCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        engine = new Engine("BMW", 100, 100);
        tyres = new Tyres("Goodyear", "240/45R1699W");
        dieselCar = new DieselCar(engine, tyres, 19000, "black", COUPE);
    }

    @Test
    public void hasCarType(){
        assertEquals(COUPE, dieselCar.getCarType());
    }

    @Test
    public void hasCarTypeDescription(){
        assertEquals("Coupe", dieselCar.getCarType().getDescription());
    }

    @Test
    public void getEngineHP(){
        assertEquals(100, dieselCar.getEngine().getHp());
    }

}
