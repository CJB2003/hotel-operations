package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    //Testing punchIn logic by getting the time property
    @Test
    public void punchIn_should_setStartTime() {
        Employee employee = new Employee(1, "Chris", "Software", 65.65, 40);

        employee.punchIn(9);

        assertEquals(9, employee.getTime());
    }

    /*
    Testing punchOut by setting a start time with punchIn() and punching out
    to calculate total hours worked for the week and also hours worked during the shift
     */
    @Test
    public void punchOut_should_calculateTotalHoursWorkedAndShiftHours() {
        Employee employee = new Employee(1, "Chris", "Software", 65.65, 40);

        employee.punchIn(9);
        employee.punchOut(19);

        int expectedHoursWorked = 50;

        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}