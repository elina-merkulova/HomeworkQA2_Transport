package PracticeWithObjects;

public class Train {
    private double gasUsagePer100km;
    private int tankVolume;
    private int passengerSeats;
    private double cartLength;
    private boolean wifiInCarts;

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

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public double getCartLength() {
        return cartLength;
    }

    public void setCartLength(double cartLength) {
        this.cartLength = cartLength;
    }

    public boolean isWifiInCarts() {
        return wifiInCarts;
    }

    public void setWifiInCarts(boolean wifiInCarts) {
        this.wifiInCarts = wifiInCarts;
    }
}
