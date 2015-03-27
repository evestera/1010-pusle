package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
	@Test
	public void testAdd() {
		assertEquals("2 + 3 should be 5", Main.add(2, 3), 5);
	}
}