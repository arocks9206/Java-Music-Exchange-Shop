import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Maple", "Black", InstrumentType.PERCUSSION, 88);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Maple", piano.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("Black", piano.getColor());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals(88, piano.getNoKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("This is the sound a piano makes", piano.play());
    }
}
