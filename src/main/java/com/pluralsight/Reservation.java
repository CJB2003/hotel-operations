package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        double price = 0;
        if (this.roomType.equalsIgnoreCase("King")) {
            price = 139.00;
        }
        else if(this.roomType.equalsIgnoreCase("Double")) {
            price = 124.00;
        }
        return price;
    }

    public double getReservationTotal() {
        double price = getPrice() * this.numberOfNights;
        if (this.isWeekend) {
            price = price * 0.1 + price;
        }
        return price;
    }
}
