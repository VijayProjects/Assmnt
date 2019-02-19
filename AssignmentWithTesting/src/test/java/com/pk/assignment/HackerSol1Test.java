package com.pk.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HackerSol1Test {
	
	private static HackerSol1 hs;
	
	@BeforeAll
	public static void beforeClass() {
		hs=new HackerSol1();
	}
	@Test
	public void minMaxSumTest1() {
		int [] arr= {256741038, 623958417, 467905213, 714532089, 938071625};
		String actual=hs.minMaxSum(arr);
		assertEquals("2063136757 2744467344", actual);
	}
	
	@Test
	public void minMaxSumTest2() {
		int [] arr= {1, 0, 1, -1, 0};
		String actual=hs.minMaxSum(arr);
		assertEquals("0 2", actual);
	}
	
	@AfterAll
	public static void afterClass() {
		hs=null;
	}

}
