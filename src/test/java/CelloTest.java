import instruments.Cello;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before(){
        cello = new Cello("Mahogany", "Red", InstrumentType.STRING,
                "Intermediate");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", cello.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("Red", cello.getColor());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, cello.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals("Intermediate", cello.getLevel());
    }

    @Test
    public void canPlay(){
        assertEquals("This is the sound a cello makes", cello.play());
    }

}
