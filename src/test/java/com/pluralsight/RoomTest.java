package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //Should set both dirty and occupied to true
    @Test
    public void checkIn_should_setIsDirty() {
        Room room1 = new Room(2, 100, false, false);

        room1.checkIn();

        assertTrue(room1.isDirty());
    }

    @Test
    public void checkIn_should_setIsOccupied() {
        Room room1 = new Room(2, 100, false, false);

        room1.checkIn();

        assertTrue(room1.isOccupied());
    }

    //Should set dirt to false and occupied to false
    @Test
    public void checkOut_should_setIsOccupied() {
        Room room2 = new Room(2, 100, true, true);

        room2.checkOut();

        assertFalse(room2.isOccupied());
    }

    @Test
    public void checkOut_should_cleanRoom() {
        Room room2 = new Room(2, 100, true, true);

        room2.checkOut();

        assertFalse(room2.isDirty());
    }

    //Testing if cleanRoom sets dirty property to false
    @Test
    public void cleanRoom_should_setDirtyFalse() {
        Room room2 = new Room(2, 100, true, true);

        room2.cleanRoom();

        assertFalse(room2.isDirty());
    }

}