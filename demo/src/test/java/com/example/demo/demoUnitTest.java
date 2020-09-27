package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.*;

public class demoUnitTest {
	
	static demo t;
	
	@BeforeAll
	public static void runBeforeTest() {
		t = new demo();
	}
	
	
	@Test
	public void testadd() {
		assertEquals(t.add(1,2),3);
	}
	
	@Test
	public void testsub() {
		assertEquals(t.sub(1,2),-1);
	}
	
	@Test
	void lambdaExpressions() {
	    assertTrue(Stream.of(1, 2, 3)
	      .mapToInt(i -> i)
	      .sum() > 5, () -> "Sum should be greater than 5");
	}
	
	@Test
	 void groupAssertions() {
	     int[] numbers = {0, 1, 2, 3, 4};
	     assertAll("numbers",
	         () -> assertEquals(numbers[0], 0),
	         () -> assertEquals(numbers[3], 3),
	         () -> assertEquals(numbers[4], 4)
	     );
	 }
	
	@AfterAll
	public static void runAfterTest() {
		assertEquals(t.done("done"),"done");
		System.out.println("done");
	}
	

}
