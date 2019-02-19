package com.pk.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HackerSol1Test {
	
	private static HackerSol1 hs;
	
	@BeforeClass
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
		assertEquals("0 1", actual);
	}
	
	@AfterClass
	public static void afterClass() {
		hs=null;
	}

}
