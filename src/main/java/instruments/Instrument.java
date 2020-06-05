package instruments;

public abstract class Instrument {

    String material;
    String color;
    InstrumentType type;
    double buyPrice;
    double sellPrice;

    public Instrument(String material, String color, InstrumentType type) {
        this.material = material;
        this.color = color;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }
}
