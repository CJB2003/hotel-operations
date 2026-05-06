package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int time;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    //Fixed this, before my payRate was being overwritten, but now it should just return a total pay
    public double getTotalPay() {
        double regularPay = payRate * this.getRegularHours();
        double overTimePay = (payRate * 1.5) * this.getOvertimeHours();
        return regularPay + overTimePay;
    }

    public int getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    public int getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void punchIn(int time) {
        this.setTime(time);
    }

    public void punchOut(int time) {
        int totalTime = time - this.time;
        System.out.println("Your shift hours worked: " + totalTime);
        this.hoursWorked += totalTime;
        System.out.println("Total hours worked: " + this.hoursWorked);
    }

    public void punchIn() {
        LocalDateTime lDT = LocalDateTime.now();
        this.time = lDT.getHour();
        System.out.println("Your start time: " + this.time);
    }

    public void punchOut() {
        LocalDateTime lDT = LocalDateTime.now();
        int totalTime = lDT.getHour() - this.time;
        this.hoursWorked += totalTime;
        System.out.println("Total time worked: " + totalTime);
        System.out.println("Hours worked this week: " + this.hoursWorked);
    }
}
