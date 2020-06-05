package instruments;

import behaviors.IPlay;
import behaviors.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int noStrings;
    private double sellPrice;
    private double buyPrice;

    public Guitar(String material, String color, InstrumentType type,
                  int noStrings, double sellPrice, double buyPrice) {
        super(material, color, type);
        this.noStrings = noStrings;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public String play(){
        return "This is the sound a guitar makes";
    }

    public int getNoStrings(){
        return this.noStrings;
    }


    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
