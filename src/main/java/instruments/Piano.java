package instruments;

import behaviors.IPlay;

public class Piano extends Instrument implements IPlay {

    private int noKeys;

    public Piano(String material, String color, InstrumentType type, int noKeys) {
        super(material, color, type);
        this.noKeys = noKeys;
    }

    public String play(){
        return "I'm the sound a piano makes";
    }

    public int getNoKeys(){
        return this.noKeys;
    }
}
