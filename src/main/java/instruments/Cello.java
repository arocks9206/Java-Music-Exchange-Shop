package instruments;

import behaviors.IPlay;

public class Cello extends Instrument implements IPlay {

    private String level;

    public Cello(String material, String color, InstrumentType type, String level) {
        super(material, color, type);
        this.level = level;
    }

    public String play() {
        return "I'm the sound a cello makes";
    }

    public String getLevel(){
        return this.level;
    }

}
