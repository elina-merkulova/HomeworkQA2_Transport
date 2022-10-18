package RouteAndTranport;

public class Transport {
    private String type;
    private double fuelUsagePer100kn;
    private double tankVolume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuelUsagePer100kn() {
        return fuelUsagePer100kn;
    }

    public void setFuelUsagePer100kn(double fuelUsagePer100kn) {
        this.fuelUsagePer100kn = fuelUsagePer100kn;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }
}
