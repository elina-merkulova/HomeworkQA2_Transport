package PracticeWithObjects;

public class PowerBank {
   private int mAh;
   private boolean lightningSlot;
   private String brand;
   private double weight;
   private double price;

    public int getmAh() {
        return mAh;
    }

    public void setmAh(int mAh) {
        this.mAh = mAh;
    }

    public boolean isLightningSlot() {
        return lightningSlot;
    }

    public void setLightningSlot(boolean lightningSlot) {
        this.lightningSlot = lightningSlot;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
