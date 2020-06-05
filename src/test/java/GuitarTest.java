import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Steel", "Silver", InstrumentType.STRING, 6);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Steel", guitar.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("Silver", guitar.getColor());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals(6, guitar.getNoStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("This is the sound a guitar makes", guitar.play());
    }


}
