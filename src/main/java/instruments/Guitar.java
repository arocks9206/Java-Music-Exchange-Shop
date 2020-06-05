package instruments;

import behaviors.IPlay;


public class Guitar extends Instrument implements IPlay {

    private int noStrings;

    public Guitar(String material, String color, InstrumentType type, int noStrings) {
        super(material, color, type);
        this.noStrings = noStrings;

    }

    public String play(){
        return "This is the sound a guitar makes";
    }

    public int getNoStrings(){
        return this.noStrings;
    }

}
