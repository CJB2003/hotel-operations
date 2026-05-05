package com.pluralsight;

import java.util.*;

public class HotelApp {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        Room room1 = new Room(2, 99, true, true);

        Reservation reservation1 = new Reservation("king", 5, true);

        Employee employee1 = new Employee(1, "Chris", "Customer Service", 21.55, 41);

        //testing my hotel class
        Hotel hotel = new Hotel("BNY Hotel", 23, 40);

        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available basic rooms: " + hotel.getAvailableRooms());

        //Testing multiple bookings
        boolean bookSuite = hotel.bookRoom(2, true);
        System.out.println("Available suites after: " + hotel.getAvailableSuites());

        //testing overbooking for the available # of rooms
        boolean maxBook = hotel.bookRoom(50, true);
        System.out.println("Can I book 50 rooms? " + maxBook);

//        employee1.punchIn();
//        employee1.punchOut();
//        System.out.println(employee1.getHoursWorked());
//
//        System.out.println("Welcome BNY Hotel, would you like to check in? (Y/N)");
//        String checkIn = myScanner.nextLine();
//        if (checkIn.equalsIgnoreCase("y")) {
//            room1.checkIn();
//        }
//        System.out.println("Would you like to checkout? (Y/N)");
//        String checkOut = myScanner.nextLine();
//        if (checkOut.equalsIgnoreCase("y")) {
//            room1.checkOut();
//        }
//
//        System.out.println("Are you an employee? (Y/N)");
//        String checkEmployee = myScanner.nextLine();
//
//        if (checkEmployee.equalsIgnoreCase("y")) {
//
//            System.out.println("Are you clocking in or out? (1 or 2)");
//            int userInOut = myScanner.nextInt();
//            myScanner.nextLine();
//
//            System.out.println("What time are you clocking in or out?");
//            int userTime = myScanner.nextInt();
//            myScanner.nextLine();
//
//            if (userInOut == 1) {
//                employee1.punchIn(userTime);
//                System.out.println("Clocked in at " + userTime + ":00");
//            } else {
//                employee1.punchOut(userTime);
//                System.out.println("Clocked out at " + userTime + ":00. Total hours: " + employee1.getHoursWorked());
//            }
//        }

//        System.out.println("Is room 1 available? " + room1.isAvailable());
//
//        System.out.printf("The total price of your reservation is: $%.2f\n", reservation1.getReservationTotal());
//
//        System.out.printf("Your pay for this week: $%.2f", employee1.getTotalPay());
    }
}
