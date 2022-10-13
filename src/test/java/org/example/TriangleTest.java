package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    @Test
    @DisplayName("Стороны корректны")
    public void Triangle1Test() {

        assertTrue(Triangle.Aria(3,4,5) > 0 );
    }
    @Test
    @DisplayName("Одна из сторон равна 0")
    public void Triangle2Test() {

        assertFalse(Triangle.Aria(0,4,5) > 0 );
    }
    @Test
    @DisplayName("Одна из сторон имеет отрицательное значение")
    public void Triangle3Test() {

        assertFalse(Triangle.Aria(-1,4,5) > 0 );
    }
}
