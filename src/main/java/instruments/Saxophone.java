package instruments;

import behaviors.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private int noValves;

    public Saxophone(String material, String color, InstrumentType type, int noValves) {
        super(material, color, type);
        this.noValves = noValves;
    }

    public String play(){
        return "I'm the sound a saxophone makes";
    }

    public int getNoValves(){
        return this.noValves;
    }
}
