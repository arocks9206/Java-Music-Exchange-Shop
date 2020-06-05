package items;

import behaviors.ISell;

public class Reed implements ISell {

    private String type;
    private double sellPrice;
    private double buyPrice;


    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
