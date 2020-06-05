package items;

import behaviors.ISell;

public class SheetMusic implements ISell {

    private String name;
    private double sellPrice;
    private double buyPrice;

    public SheetMusic(String name, double sellPrice, double buyPrice) {
        this.name = name;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }


    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
}
