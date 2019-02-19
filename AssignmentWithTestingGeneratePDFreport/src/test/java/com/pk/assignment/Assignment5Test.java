package com.pk.assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment5Test {
	
	private static Assignment5 as;
	
	@BeforeClass
	public static void beforeClass() {
		as=new Assignment5();
	}
	@Test
	public void minMaxSumTest1() {
		int [] arr= {256741038, 623958417, 467905213, 714532089, 938071625};
		int[] actual=as.sort(arr);
		int[] expected= {256741038, 467905213, 623958417, 714532089, 938071625};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void minMaxSumTest2() {
		int [] arr= {2, 5, 0, -1, 3};
		int[] actual=as.sort(arr);
		int[] expected= {-1, 0, 2, 3, 5};
		assertArrayEquals(expected, actual);
	}
	
	@AfterClass
	public static void afterClass() {
		as=null;
	}

}
