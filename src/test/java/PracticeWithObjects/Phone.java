package PracticeWithObjects;

public class Phone {
    private int ramMemory;
    private int ssdMemory;
    private double width;
    private boolean twoSimCards;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getSsdMemory() {
        return ssdMemory;
    }

    public void setSsdMemory(int ssdMemory) {
        this.ssdMemory = ssdMemory;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isTwoSimCards() {
        return twoSimCards;
    }

    public void setTwoSimCards(boolean twoSimCards) {
        this.twoSimCards = twoSimCards;
    }

    public double getPrice() {

        return price;
    }

}
