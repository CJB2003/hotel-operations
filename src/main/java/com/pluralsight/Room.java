package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        boolean available = false;
        if (!isDirty() && !isOccupied()) {
            available = true;
        }
        return available;
    }

    public void checkIn() {
        this.setDirty(true);
        this.setOccupied(true);
        System.out.println("You're checked in!");
    }

    public void checkOut() {
        this.setOccupied(false);
        cleanRoom();
        System.out.println("We hope you enjoyed your stay! You're checked out!");
    }
    public void cleanRoom() {
        this.setDirty(false);
    }
}
