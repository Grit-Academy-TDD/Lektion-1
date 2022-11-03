package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void fiveIsTheMinValueOf567() {
        assertEquals(5, Main.min(5, 6, 7));
    }

    @Test
    public void threeIsTheMinOf543() {
        assertEquals(3, Main.min(5, 4, 3));
    }

    @Test
    public void twoIsTheMinOf523() {
        assertEquals(2, Main.min(5, 2, 3));
    }

    @Test
    public void twoIsNotTheMinOf521() {
        assertNotEquals(2, Main.min(5, 2, 1));
    }

    @Test
    public void twoIsTheMinOf522() {
        assertEquals(2, Main.min(5, 2, 2));
    }
}