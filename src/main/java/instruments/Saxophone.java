package instruments;

import behaviors.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private int valves;

    public Saxophone(String material, String color, InstrumentType type, int valves) {
        super(material, color, type);
        this.valves = valves;
    }

    public String play(){
        return "This is the sound a saxophone makes";
    }

    public int getValves(){
        return this.valves;
    }
}
