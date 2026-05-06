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

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    private void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    private void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        if (!isDirty() && !isOccupied()) {
            return true;
        }
        return false;
    }

    public void checkIn() {
        if (!isOccupied()) {
            this.setDirty(true);
            this.setOccupied(true);
            System.out.println("You're checked in!");
        }
    }

    public void checkOut() {
        cleanRoom();
        this.setOccupied(false);
        System.out.println("We hope you enjoyed your stay! You're checked out!");
    }
    public void cleanRoom() {
        this.setDirty(false);
    }
}
