package org.grit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		// fail("Not yet implemented");
		// assertEquals(5, 3 + 2);
		// assertEquals(5, 3 +1);
	}

	@Test
	void fivePlusFiveIsTen() {
		assertEquals(10, Main.add(5, 5));
	}

	@Test
	void threePlusTwoIsNotTwo() {
		assertNotEquals(2, Main.add(3, 2));
	}
	
	@Test
	void twoMinusTwoIsZero() {
		assertEquals(0, Main.minus(2,2));
	}
	
	
	
}
