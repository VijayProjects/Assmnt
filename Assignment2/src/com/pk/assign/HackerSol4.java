/*Q. Given five positive integers, find the occurrences of maximum value that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example,
. Our minimum sum is and our maximum sum is . We would print*/
package com.pk.assign;

import java.util.ArrayList;
import java.util.Arrays;

public class HackerSol4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3 };
		int ar[] = null;
		int l = arr.length;
		ArrayList<int[]> al = new ArrayList<>();

		for (int n = l; n > 1; n--) {
			ar = new int[n];
			for (int i = 0, j = 0; i < n + j; i++) {
				ar[i - j] = arr[i];
				if (i != l - 1 && i == n + j - 1) {
					i = (++j) - 1;
					al.add(ar);
					ar = new int[n];
				}
			}
			al.add(ar);
		}

		/*
		 * for (int[] a : al) System.out.println(Arrays.toString(a));
		 */
		ar=al.get(2);
		int count=0;
		while(true) {
			if(ar[3]-ar[2]>1 && ar[3]!=0)
				ar[3]=ar[2]+1;
			else if(ar[2]-ar[1]>1 && ar[2]!=0)
				ar[2]=ar[1]+1;
			else if(ar[1]-ar[0]>1 && ar[1]!=0)
				ar[1]=ar[0]+1;
			else if(ar[0]!=0)
				ar[0]--;
			else
				break;
			count++;
		}
		if(count%2==0)
			System.out.println("Hardley wins:"+count+" "+Arrays.toString(ar));
		else
			System.out.println("Laurel wins"+count);
	}
}
