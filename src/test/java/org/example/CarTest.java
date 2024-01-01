package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testConstructor() {
        Car c1 = new Car(3);
        assertEquals(2, c1.x);
    }

}