package items;

import behaviors.ISell;

public class GuitarString implements ISell {

    private double sellPrice;
    private double buyPrice;
    private String type;

    public GuitarString(double sellPrice, double buyPrice, String type) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.type = type;
    }

    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
