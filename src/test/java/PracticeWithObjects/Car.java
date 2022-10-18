package PracticeWithObjects;

public class Car {
private String Colour;
private double weight;
private double gasUsagePer100km;
private float mileage;

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    private boolean used;



    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getGasUsagePer100km() {
        return gasUsagePer100km;
    }

    public void setGasUsagePer100km(double gasUsagePer100km) {
        this.gasUsagePer100km = gasUsagePer100km;
    }

    private String colour;

}
