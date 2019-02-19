/*Q. Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example,
. Our minimum sum is and our maximum sum is . We would print*/
package com.pk.assignment;

import java.util.Arrays;

public class HackerSol1 {

	public String minMaxSum(int [] arr) {
		//int [] arr= {256741038, 623958417, 467905213, 714532089, 938071625};
		int carry=0;
		int holdVal=0;
		int j=0;
		boolean flag=true, flag1=false;
		for(int i=0; i<arr.length; i++) {
			flag=true;
			for(j=i+1; j<arr.length;j++) {
				if(arr[i]<=arr[j])
					continue;
				else {
					if(flag1)
					carry=i;
					i=j-1;
					flag=false;
					flag1=false;
					break;
				}
			}
			if(flag && j==arr.length) {
				//swap values of array
				holdVal=arr[i];
				arr[i]=arr[carry];
				arr[carry]=holdVal;
				i=carry++;
				flag1=true;
				if(carry>3)
					break;
			}
			
		}
		//System.out.println(Arrays.toString(arr));
		 long sumMin=0, sumMax=0;
	        for(int i=0; i<arr.length-1; i++){
	            sumMin+=arr[i];
	            sumMax+=arr[i+1];
	        }
	        return sumMin+" "+sumMax;
	}

}
