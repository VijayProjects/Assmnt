/*Q. Given five positive integers, find the occurrences of maximum value that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example,
. Our minimum sum is and our maximum sum is . We would print*/
package com.pk.assign;

import java.util.Arrays;

public class HackerSol2 {

	public static void main(String[] args) {
		int [] arr= {5, 4, 5,3, 1};
		int carry=1;
		int holdVal=0;
		//int j=0;
		boolean flag=true, flag1=false;
		for(int i=0, j=1; j<arr.length;) {
			if(arr[i]>arr[j]) {
				j++;
			}else {
				if(arr[i]==arr[j])
					carry++;
				
				i=j;
				j=i+1;
			}
		}
			
		
		System.out.println(carry);
		 
	}

}
