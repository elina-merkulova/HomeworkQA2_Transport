package PracticeWithObjects;

import java.math.BigDecimal;

public class House {
private String address;
private BigDecimal price;
private int roomCount;
private float wallHeight;
private boolean renovationNeeded;

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public Float getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(Float wallHeight) {
        this.wallHeight = wallHeight;
    }

    public Boolean getRenovationNeeded() {
        return renovationNeeded;
    }

    public void setRenovationNeeded(Boolean renovationNeeded) {
        this.renovationNeeded = renovationNeeded;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    private int numberOfRooms;
}


