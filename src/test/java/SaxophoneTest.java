import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Brass", "Gold", InstrumentType.WOODWIND,
                1);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColor(){
        assertEquals("Gold", saxophone.getColor());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.WOODWIND, saxophone.getType());
    }

    @Test
    public void hasValves(){
        assertEquals(1, saxophone.getValves());
    }

    @Test
    public void canPlay(){
        assertEquals("This is the sound a saxophone makes", saxophone.play());
    }
}
