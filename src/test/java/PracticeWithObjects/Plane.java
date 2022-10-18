package PracticeWithObjects;

public class Plane {
    private double gasUsagePer100km;
    private int tankVolume;
    private double maxFlightHeight;
    private String Brand;
    private boolean BusinessClass;

    public double getGasUsagePer100km() {
        return gasUsagePer100km;
    }

    public void setGasUsagePer100km(double gasUsagePer100km) {
        this.gasUsagePer100km = gasUsagePer100km;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getMaxFlightHeight() {
        return maxFlightHeight;
    }

    public void setMaxFlightHeight(double maxFlightHeight) {
        this.maxFlightHeight = maxFlightHeight;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public boolean isBusinessClass() {
        return BusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        BusinessClass = businessClass;
    }
}
