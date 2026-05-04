package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        Room room1 = new Room(2, 99, true, true);

        Reservation reservation1 = new Reservation("king", 5, true);

        Employee employee1 = new Employee(1, "Chris", "Customer Service", 21.55, 41);

        System.out.println("Is room 1 available? " + room1.isAvailable());

        System.out.printf("The total price of your reservation is: $%.2f\n", reservation1.getReservationTotal());

        System.out.printf("Your pay for this week: $%.2f", employee1.getTotalPay());
    }
}
